package com.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bank.dbutil.JDBconection;

public class TransactionDao {
	public boolean createTransaction(int accountNo,String transactionType, double amut) {
		boolean transactionCreated = false;
		
		int rowsInserted = 0;
		Connection myConn = null;
		
		try {
			myConn = JDBconection.getConnection();
			String insertTransaction = "insert into transaction (transaction_type, amount, account_no)values(?,?,?)";
			PreparedStatement ps = myConn.prepareStatement(insertTransaction);
			ps.setString(1, transactionType);
			ps.setDouble(2, amut);
			ps.setInt(3, accountNo);
			rowsInserted = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		if (rowsInserted ==1) {
			transactionCreated = true;
		}
			return transactionCreated;
		}
	}


