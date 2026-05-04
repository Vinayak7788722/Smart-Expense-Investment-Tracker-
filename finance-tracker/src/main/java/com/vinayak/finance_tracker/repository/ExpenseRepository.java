package com.vinayak.finance_tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinayak.finance_tracker.entity.Expense;


public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
