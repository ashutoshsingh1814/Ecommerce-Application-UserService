package com.ecom.user_service.repository;

import com.ecom.user_service.entity.Credential;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CredentialRepo extends JpaRepository<Credential, Integer> {
}
