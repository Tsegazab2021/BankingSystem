package com.bank;
import java.sql.SQLException;
import com.bank.model.Account;
import com.bank.service.AccountService;

public class BankingApp {

	public  void main(String[] args) throws SQLException {

		// Creating account objects
		Account Jhon = new Account(101, "Jhon", "Doe", 2500);
		Account Tesfay = new Account(102, "Tesfay", "Kiros", 1250);
		Account Hadgu = new Account(103, "Hadgu", "Kindeya", 2500);

		// Create account dao

		AccountService accountService = new AccountService();
		accountService.InsertAccount(Jhon);
		accountService.InsertAccount(Tesfay);
		accountService.InsertAccount(Hadgu);

		 System.out.println("You have created an account for: " + Jhon +"\n" + Tesfay +"\n" + Hadgu+"\n");
		 // Make a deposit to all three accounts
		 accountService.deposit(Jhon, 1000);
		 accountService.deposit(Tesfay, 1000);
		 accountService.deposit(Hadgu, 1000);

		 accountService.withdraw(Hadgu, 500);
		 
		 // Transfer money
		 
		 accountService.transfer(Hadgu, Tesfay, 750, "Vacation Money");
		 System.out.println("after transfer\n" + Hadgu+ "\n" +Tesfay);

	}

}
