package com.Hachathon.Banking_Transaction.model;

import java.math.BigDecimal;

/** a single bank account. */
public class Account {
    private final String accountId;
    private final String customerName;
    private final String accountType;
    private final String status;
    private final BigDecimal dailyLimit;
    private final String currency;
    private BigDecimal balance;

    public Account(String accountId, String customerName, String accountType, String status,
                   BigDecimal balance, BigDecimal dailyLimit, String currency) {
        this.accountId = accountId;
        this.customerName = customerName;
        this.accountType = accountType;
        this.status = status;
        this.balance = balance;
        this.dailyLimit = dailyLimit;
        this.currency = currency;
    }

    public boolean isActive() { return "ACTIVE".equalsIgnoreCase(status); }
    public void debit(BigDecimal amt) { balance = balance.subtract(amt); }
    public void credit(BigDecimal amt) { balance = balance.add(amt); }

    public String getAccountId() { return accountId; }
    public String getCustomerName() { return customerName; }
    public String getAccountType() { return accountType; }
    public String getStatus() { return status; }
    public BigDecimal getBalance() { return balance; }
    public BigDecimal getDailyLimit() { return dailyLimit; }
    public String getCurrency() { return currency; }
}
