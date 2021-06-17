package com.bank.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bank.dbutil.JDBconection;
import com.bank.model.Account;

public class AccountDao {

	public static boolean InsertAccount(Account acct) throws SQLException {
		Connection myConn = null;

		try {

			myConn = JDBconection.getConnection();
			String sqlInsert = "insert into account(first_name,last_name,balance)values(?,?,?)";
			PreparedStatement ps = myConn.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);// To auto
																										// generate
																										// account no

			ps.setString(1, acct.getFirstName());
			ps.setString(2, acct.getLastName());
			ps.setDouble(3, acct.getBalance());
			ps.executeUpdate();

			try (ResultSet rs = ps.getGeneratedKeys()) {
				if (rs.next()) {
					acct.setAccountNo(rs.getInt(1));
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			myConn.close();
		}
		return false;

	}

	public void updateBalance(int accountNo, double amut) {
		Connection myConn = null;
		try {
			String updateBalance = "update account set balance = balance + ? where account_no = ?	";
			myConn = JDBconection.getConnection();
			PreparedStatement ps = myConn.prepareStatement(updateBalance);
			ps.setDouble(1, amut);
			ps.setInt(2, accountNo);
			ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
}