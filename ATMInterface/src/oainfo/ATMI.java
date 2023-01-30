package oainfo;

import java.util.Scanner;


public class ATMI {

	public static void main(String[] args) {
		
		ATMInterface op=new AtmOp(); //object for ATMInterface
		
		//validation of user
		int atmno=98765; 
		int atmpin=456;
		
		Scanner in =new Scanner(System.in);   
		
		System.out.println("-------- Welcome to ICI ATM --------");
		System.out.println("Enter your ATM Number:\t");
		int AtmNumber=in.nextInt();
		
		System.out.println("Enter your Pin:\t");
		int AtmPin=in.nextInt();
		
		if((atmno==AtmNumber)&&(atmpin==AtmPin)) {
			
			while(true) {
				System.out.println("Please choose one option to continue:");
				System.out.println("\t1.Transaction History\n\t2.Withdraw\n\t3.Deposit\n\t4.Transfer\n\t5.Quit");
				System.out.println("Enter your choice:\t");
				int ch=in.nextInt();
				if(ch==1) {
					
					op.viewBalance();
					op.viewTansaction();
					
					//transaction history
					
				}
				
				else if(ch==2) {
					
					System.out.println("----- To Withdraw Money -----\nEnter the amount to Withdraw:");
					double withdrawAmt=in.nextDouble();
					op.withdrawAmt(withdrawAmt);
					
					//withdraw
				}
				
				else if(ch==3) {
					System.out.println("----- To Deposit Money -----\nEnter the amount to be deposited:");
					double depositAmt=in.nextDouble();
					op.depositAmt(depositAmt);
					
					
					
					//deposit
				}
				
				else if(ch==4) {
					
					System.out.println("----- To Transfer Money -----\nEnter the Account Number: ");
					int transacc=in.nextInt();
					
					System.out.println("Enter the Transfer Amount: ");
					double transferAmt=in.nextDouble();
					op.viewTransfer(transferAmt);
					
					
					//transfer
				}
				
				else if(ch==5) {
					System.out.println("Collect your ATM Card.\nThank-You!");
					System.exit(0);
					
					//exit
				}
				
				else {
					System.out.println("Please enter valid choice!");
					
				}
			}
			
		}
		
		else {
			System.out.println("Incorrect ATM Number or Pin!");
			System.exit(0);
					
		}
			
		
		

	}

}
