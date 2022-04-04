package com.Civil.Civil.service;

import com.Civil.Civil.entity.User;
import com.Civil.Civil.repository.UserRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserService {

    private final Log LOG = LogFactory.getLog(UserService.class);
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional // nos permite hacer un rootback
    public void saveTransactional(List<User> Id_Usuario){
        Id_Usuario.stream().peek(user -> LOG.info("Usuario insertado" + user)).forEach(userRepository::save);//forEach(user -> userRepository.save(user));
    }
    public List<User> getAllUser(){
        return userRepository.findAll();
    }
    public User save(User newUser) {
        return userRepository.save(newUser);
    }






}
