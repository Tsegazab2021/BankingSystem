package com.bank.model;

public class Transfer {

	private int transferId;
	private int fromAccount;
	private int toAccount;
	private double amount;
	private String reeason;
	public Transfer( int fromAccount, int toAccount, double amount, String reeason) {
		super();

		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.amount = amount;
		this.reeason = reeason;
	}
	public int getTransferId() {
		return transferId;
	}
	public void setTransferId(int transferId) {
		this.transferId = transferId;
	}
	public int getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(int fromAccount) {
		this.fromAccount = fromAccount;
	}
	public int getToAccount() {
		return toAccount;
	}
	public void setToAccount(int toAccount) {
		this.toAccount = toAccount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getReeason() {
		return reeason;
	}
	public void setReeason(String reeason) {
		this.reeason = reeason;
	
	}

	public String toString() {
		return "Transfer [transferId=" + transferId + ", fromAccount=" + fromAccount + ", toAccount=" + toAccount
				+ ", amount=" + amount + ", reeason=" + reeason + "]";
	}
	
	
	}
	
	

