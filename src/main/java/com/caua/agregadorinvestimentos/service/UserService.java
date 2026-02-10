package com.caua.agregadorinvestimentos.service;

import com.caua.agregadorinvestimentos.controller.CreateUserDto;
import com.caua.agregadorinvestimentos.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(CreateUserDto createUserDto) {

    }
}
