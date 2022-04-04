package com.Civil.Civil.controller;

import com.Civil.Civil.caseuse.CreateUserUseCase;
import com.Civil.Civil.caseuse.GetUser;
import com.Civil.Civil.entity.User;
import com.Civil.Civil.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private CreateUserUseCase createUserUseCase;
    private GetUser getUser;
    private UserRepository userRepository;

    public UserController(CreateUserUseCase createUserUseCase, GetUser getUser, UserRepository userRepository) {
        this.createUserUseCase = createUserUseCase;
        this.getUser = getUser;
        this.userRepository =userRepository;
    }

    @GetMapping("/")
    List<User> get(){
        return getUser.getAll();
    }

    @PostMapping("/")
    ResponseEntity<User> newUser(@RequestBody User newUser) {
        return new ResponseEntity<>(createUserUseCase.save(newUser), HttpStatus.CREATED);
    }
}

