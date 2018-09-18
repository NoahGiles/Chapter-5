package practice;

import java.util.Scanner;

public class DoorGame {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int doorChoice;
		String result;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the amazing door choice game!");
		System.out.println("Your host, Steve Harvey.");
		System.out.println("\nPick a door, any door. \n1- for door One\n2- for door Two\n3- for door Three");
		doorChoice = input.nextInt();
		
		
		if(doorChoice == 1) 
		{
			result = "a pile of gold";
		}
		else if(doorChoice == 2)
		{
			result = "absolutely nothing. The door was empty";
		}
		else if(doorChoice == 3)
		{
			result = "a brain parasite";
		}
		else
			result = "nothing. You didn't open a door";
		
		displayMessage(result);
	}
	public static void displayMessage(String result) {
		System.out.println("You won " + result + ".");
	}
}
