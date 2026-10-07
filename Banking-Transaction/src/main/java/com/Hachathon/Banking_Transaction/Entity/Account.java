package com.Hachathon.Banking_Transaction.Entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {
	
	 @Id
	    private String accountId;

	    private String customerName;
	    private String accountType;
	    private String status;

	    private BigDecimal balance;
	    private BigDecimal dailyLimit;

	    private String currency;
	    private LocalDate openedDate;
		public String getAccountId() {
			return accountId;
		}
		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getAccountType() {
			return accountType;
		}
		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public BigDecimal getBalance() {
			return balance;
		}
		public void setBalance(BigDecimal balance) {
			this.balance = balance;
		}
		public BigDecimal getDailyLimit() {
			return dailyLimit;
		}
		public void setDailyLimit(BigDecimal dailyLimit) {
			this.dailyLimit = dailyLimit;
		}
		public String getCurrency() {
			return currency;
		}
		public void setCurrency(String currency) {
			this.currency = currency;
		}
		public LocalDate getOpenedDate() {
			return openedDate;
		}
		public void setOpenedDate(LocalDate openedDate) {
			this.openedDate = openedDate;
		}
	    
	    
	    

}
