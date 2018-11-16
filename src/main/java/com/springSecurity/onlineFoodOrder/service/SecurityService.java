package com.springSecurity.onlineFoodOrder.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}