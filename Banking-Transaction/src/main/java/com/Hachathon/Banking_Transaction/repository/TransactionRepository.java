package com.Hachathon.Banking_Transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hachathon.Banking_Transaction.Entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
