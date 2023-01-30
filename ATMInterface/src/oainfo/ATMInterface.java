package oainfo;

public interface ATMInterface {
	
	public void viewBalance();
	public void withdrawAmt(double withdrawAmt);
	public void depositAmt(double depositAmt);
	public void viewTansaction();
	public void viewTransfer(double transferAmt);

}
