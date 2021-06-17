package com.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bank.dbutil.JDBconection;

public class TransferDao {

	public boolean createTransfer(int fromAccount, int toAccount, String reason, double amut) {
		boolean transferCreated = false;

		Connection myConn = null;

		try {
			myConn = JDBconection.getConnection();

			String insertTransfer = "insert into transfer(,from_account,to_account,amount,reeason)values(?,?,?,?)";
			PreparedStatement ps = myConn.prepareStatement(insertTransfer);

			ps.setInt(1, fromAccount);
			ps.setInt(2, toAccount);
			ps.setDouble(3, amut);
			ps.setString(4, reason);
			ps.executeUpdate();
			


		} catch (Exception e) {
			e.printStackTrace();
		}
		return transferCreated;
	}

	
		
	}

