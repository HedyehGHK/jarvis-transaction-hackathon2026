package com.Hachathon.Banking_Transaction.data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Hachathon.Banking_Transaction.repository.AccountRepository;
import com.Hachathon.Banking_Transaction.repository.TransactionRepository;

@Component
public class CsvDataLoader implements CommandLineRunner {

    private final AccountRepository accountRepository;
    private final TransactionRepository transactionRepository;

    public CsvDataLoader(
            AccountRepository accountRepository,
            TransactionRepository transactionRepository) {
        this.accountRepository = accountRepository;
        this.transactionRepository = transactionRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadAccounts();
        loadTransactions();
    }

    private void loadAccounts() {
        // read accounts.csv
        // convert each row into Account
        // accountRepository.save(account)
    }

    private void loadTransactions() {
        // read transactions.csv
        // convert each row into Transaction
        // transactionRepository.save(transaction)
    }
}
