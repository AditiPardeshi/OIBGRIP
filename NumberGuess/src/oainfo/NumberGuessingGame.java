package oainfo;

import java.util.Random;
import java.util.Scanner;


public class NumberGuessingGame {
	

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int randomNumber = rand.nextInt(100) + 1;
		
		System.out.println("----- Welcome to the Number Guessing Game -----");
		System.out.println("-----Here are some basic rules-----\n\t1.Guess the number between 1 to 100.");
		System.out.println("\t2.The player will get only 6 attempts to guess the game.\n\t3.The points will ne given based on your attempts*100\nGoodluck! Guess Well!");
		
		int count=0;
		
		label:
			
			while(count<=5) {
				
				System.out.println("Enter your guess:");
				
				int playerGuess = scanner.nextInt();
				
				if(playerGuess == randomNumber) {
					System.out.println("-----Correct!!!-----\n!!!You Win!!!");
					System.out.println("Your score is:"+ count*100);
					
					System.out.println("Want to play again?\nPress 1 for Yes or 0 for No:");
					int newattempt = scanner.nextInt();
						
						if(newattempt==1) {
							count=0;
							continue label;	
						}
						
						else {
							break;	
						}
					
					
					
				}
				
				else if(randomNumber > playerGuess) {
					System.out.println("Nope! The number is higher!\nGuess Again!");
					System.out.println("You have "+ (5-count) +" attempts left!");
				}
				
				else {
					System.out.println("Nope! The number is lower!\nGuess Again!");
					System.out.println("You have "+ (5-count) +" attempts left!");
				}
				
				count++;
				
				
				if(count==6) {
					System.out.println("-----Oops!-----\nYou Lose!\nYour score is 0!\nBetter Luck next time!");
					
					System.out.println("Want to play again?\nPress 1 for Yes or 0 for No:");
					int newattempt = scanner.nextInt();
						
						if(newattempt==1) {
							count=0;
							continue label;	
						}
						
						else {
							break;	
						}
				}
			}
						
		
		

	}

}
