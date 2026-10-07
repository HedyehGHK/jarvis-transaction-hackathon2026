package com.Hachathon.Banking_Transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hachathon.Banking_Transaction.Entity.Account;

public interface AccountRepository extends JpaRepository<Account, String> {
}

