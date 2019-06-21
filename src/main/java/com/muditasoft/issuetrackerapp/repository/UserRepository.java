package com.muditasoft.issuetrackerapp.repository;

import com.muditasoft.issuetrackerapp.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
