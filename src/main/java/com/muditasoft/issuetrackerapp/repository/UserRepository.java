package com.muditasoft.issuetrackerapp.repository;

import com.muditasoft.issuetrackerapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
