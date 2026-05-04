package com.vinayak.finance_tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinayak.finance_tracker.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}