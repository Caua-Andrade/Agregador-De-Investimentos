package com.caua.agregadorinvestimentos.service;

import com.caua.agregadorinvestimentos.controller.CreateUserDto;
import com.caua.agregadorinvestimentos.entity.User;
import com.caua.agregadorinvestimentos.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UUID createUser(CreateUserDto createUserDto) {

        var entity = new User(
                null, // <-- MUITO IMPORTANTE
                createUserDto.username(),
                createUserDto.email(),
                createUserDto.password(),
                null,
                null
        );

        var userSaved = userRepository.save(entity);

        return userSaved.getUserId();
    }

    public Optional<User> getUserById(String userId) {

        return userRepository.findById(UUID.fromString(userId));
    }

}
