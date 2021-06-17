package com.bank.service;

import java.sql.SQLException;

import com.bank.dao.AccountDao;
import com.bank.dao.TransactionDao;
import com.bank.dao.TransferDao;
import com.bank.model.Account;

public class AccountService<fromAccount, toAccount> {

	AccountDao accountDao = new AccountDao();
	TransactionDao transactionDao = new TransactionDao();
	TransferDao transferDao = new TransferDao();

	public void InsertAccount(Account acct) throws SQLException {
		AccountDao.InsertAccount(acct);

	}
	// Deposit service

	public void deposit(Account acct, double amut) {
		// deposit logic
		// Create transaction
		int accountNo = acct.getAccountNo();
		boolean success = transactionDao.createTransaction(acct.getAccountNo(), "Deposit", amut);
		if (success) {
			System.out.println("Transaction created successfully");
			accountDao.updateBalance(accountNo, amut);
			System.out.println("Account table updated successfully");
			

		}

	}

	// Withdraw service
	public void withdraw(Account acct, double amut) {
		if (acct.getBalance() > amut) {

			int accountNo = acct.getAccountNo();
			double neg_amut = -1 * amut;
			boolean success = transactionDao.createTransaction(acct.getAccountNo(), "Withdraw", amut);
			if (success) {
				System.out.println("Transaction created successfully");
				accountDao.updateBalance(accountNo, neg_amut);
				System.out.println("Account table updated successfully");
			}
		} else {
			System.out.println("Insufficient balance");
		}

	}

	public void transfer(Account acct1, Account acct2, double amut, String reason) {
		int accountNo = acct1.getAccountNo();
		boolean success = transferDao.createTransfer(acct1.getAccountNo(), acct2.getAccountNo(), "Transfer", 750);
		if (success) {
			System.out.println("Money transfered successfully");
			accountDao.updateBalance(accountNo, 750);
			System.out.println("Account table updated");

		
	}else {
		System.out.println("Transfer failed");
	}	
	}
}