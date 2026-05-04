package com.vinayak.finance_tracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinayak.finance_tracker.entity.User;
import com.vinayak.finance_tracker.repository.UserRepository;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public String login(String username, String password) {

        User user = userRepository.findByUsername(username);

        if (user == null) {
            return "User not found";
        }

        if (user.getPassword().equals(password)) {
            return "Login Success";
        }

        return "Invalid Credentials";
    }
}