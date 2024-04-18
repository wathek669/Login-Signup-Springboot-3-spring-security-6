package com.example.spring.security.module.repository;

import com.example.spring.security.module.entity.Role;
import com.example.spring.security.module.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email ) ;
    User findByRole(Role role);
}
