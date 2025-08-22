package com.ecom.user_service.service;

import com.ecom.user_service.dto.UserDto;
import com.ecom.user_service.entity.Credential;
import com.ecom.user_service.entity.User;
import com.ecom.user_service.mapper.UserMapper;
import com.ecom.user_service.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService{

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserDto saveUser(UserDto userDto) {

        User user = userMapper.toEntity(userDto);
        Credential credential = user.getCredential();

        // TO DO: As of now we are providing original password to DB, but we need to store encoded password.
        //BiDirectional.
        credential.setUser(user);
        User dbUser = userRepo.save(user);

        return userMapper.toDto(dbUser);
    }

    @Override
    public UserDto findById(Integer UserId) {
        return userRepo.findById(UserId).map(userMapper::toDto)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + UserId));
    }

    @Override
    public UserDto update(Integer userId, UserDto userDto) {
    User existingUser = userRepo.findById(userId)
            .orElseThrow(() -> new RuntimeException("User not found with id: " + userId));

             existingUser.setFirstName(userDto.getFirstName());
             existingUser.setLastName(userDto.getLastName());
             existingUser.setEmail(userDto.getEmailAddress());
             existingUser.setPhone(userDto.getContact());

             User updatedUser = userRepo.save(existingUser);
        return userMapper.toDto(updatedUser);
    }
}
