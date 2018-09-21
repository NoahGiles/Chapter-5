package gameZone;

import java.util.Scanner;

public class PickANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userGuess;
		int computerSecret;
		int quit;
		String result= null;
		computerSecret = (int)(Math.random() * 10 + 1);
		
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Pick a number, any number as long as it's no higher than 10 >> ");
			userGuess = input.nextInt();
			
			if(userGuess < computerSecret) {
				result = "The number is higher";
			}
			else if(userGuess > computerSecret) {
				result = "The number is lower";
			}
			else if(userGuess == computerSecret) {
				result = "You win!";
		}
		displayMessage(result);
		System.out.print("Do you want to quit? 1 for yes 2 for no >> ");
		quit = input.nextInt();
		}while(1 != quit);
	}
	public static void displayMessage(String result) {
		System.out.println(result);
	}
}
