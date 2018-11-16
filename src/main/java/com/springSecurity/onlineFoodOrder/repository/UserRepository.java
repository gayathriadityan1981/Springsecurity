package com.springSecurity.onlineFoodOrder.repository;

import com.springSecurity.onlineFoodOrder.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}