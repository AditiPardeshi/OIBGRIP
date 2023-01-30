package oainfo;

public class ATM {
	
	//defining required variables
	private double balance;
	private double depositAmt;
	private double withdrawAmt;
	private double transferAmt;
	
	
	//constructor
	public ATM() {
		
	}
	
	//getter setter
	
	public double getBalance() {
		return balance;	
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public double getDepAmt() {
		return depositAmt;	
	}
	
	public void setDepAmt(double depositAmt) {
		this.depositAmt=depositAmt;
	}
	
	public double getWithdrawAmt() {
		return withdrawAmt;	
	}
	
	public void setWithdrawAmt(double withdrawAmt) {
		this.withdrawAmt=withdrawAmt;
		
	}
	
	public double gettransferAmt() {
		return transferAmt;	
	}
	
	public void settransferAmt(double transferAmt) {
		this.transferAmt=transferAmt;
	}
}
