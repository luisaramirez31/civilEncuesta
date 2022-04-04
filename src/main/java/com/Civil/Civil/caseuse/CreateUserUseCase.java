package com.Civil.Civil.caseuse;

import com.Civil.Civil.entity.User;
import com.Civil.Civil.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class CreateUserUseCase {

    private UserService userService;

    public CreateUserUseCase(UserService userService) {
        this.userService = userService;
    }

    public User save(User newUser) {
        return userService.save(newUser);
    }
}
