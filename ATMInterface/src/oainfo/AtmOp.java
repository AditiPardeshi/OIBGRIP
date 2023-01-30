package oainfo;

import java.util.HashMap;
import java.util.Map;

public class AtmOp implements ATMInterface{
	
	ATM atm=new ATM(); //object for class ATM
	
	Map<Double,String> TransHistory=new HashMap<>();
	
	
	

	
	@Override
	public void viewBalance() {
		System.out.println("Available Balance is: "+atm.getBalance());
		
	}

	@Override
	public void withdrawAmt(double withdrawAmt) {
		if(withdrawAmt%500==0) {
			if(withdrawAmt<=atm.getBalance()) {
				
				TransHistory.put(withdrawAmt,"Amount Withdrawn");
				System.out.println("Your Withdrawal Amount is: "+ withdrawAmt+"\nPlease collect your Cash");
				atm.setBalance(atm.getBalance()-withdrawAmt);
				viewBalance();		
			}
			
			else {
				System.out.println("Insufficient Balance!");
			}
		}
		
		else {
			System.out.println("Please Enter the amount in the multiple of 500.");
		}
		
		
		
	}

	@Override
	public void depositAmt(double depositAmt) {
		
		TransHistory.put(depositAmt,"Amount Deposited");
		
		System.out.println(depositAmt+"  Deposited Successfully!");
		atm.setBalance(atm.getBalance()+ depositAmt);
		viewBalance();
		
		
	}

	@Override
	public void viewTansaction() {
		
		System.out.println("----- Your Transaction History -----");
		
		for(Map.Entry<Double, String> m:TransHistory.entrySet()) {
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
		
	}

	@Override
	public void viewTransfer(double transferAmt) {
		
		if(transferAmt<=atm.getBalance()) {
			TransHistory.put(transferAmt,"Amount Transfered");
			
			System.out.println(transferAmt+"  Transfered Successfully!");
			atm.setBalance(atm.getBalance()- transferAmt);
			viewBalance();
			
		}
		
	}

	
	
	
	

}
