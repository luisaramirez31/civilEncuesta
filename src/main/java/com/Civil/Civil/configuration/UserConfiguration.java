package com.Civil.Civil.configuration;

import com.Civil.Civil.caseuse.GetUser;
import com.Civil.Civil.caseuse.GetUserImplement;
import com.Civil.Civil.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {
    @Bean
    GetUser getUser(UserService userService){
        return new GetUserImplement(userService);
    }
}
