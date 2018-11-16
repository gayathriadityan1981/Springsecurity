package com.springSecurity.onlineFoodOrder.service;

import com.springSecurity.onlineFoodOrder.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}