package com.ecom.user_service.repository;

import com.ecom.user_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
