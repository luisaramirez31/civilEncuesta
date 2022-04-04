package com.Civil.Civil.caseuse;

import com.Civil.Civil.entity.User;
import com.Civil.Civil.service.UserService;

import java.util.List;

public class GetUserImplement implements GetUser
{
    private UserService userService;

    public GetUserImplement(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<User> getAll() {
        return userService.getAllUser();
    }
}
