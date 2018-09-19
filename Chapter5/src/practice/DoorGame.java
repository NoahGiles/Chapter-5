package practice;

import java.util.Scanner;

public class DoorGame
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int doorChoice;
		int chestChoice;
		int bookChoice;
		String result = null;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the amazing door choice game!");
		System.out.println("Your host, Steve Harvey.");
		System.out.println("\nPick a door, any door. \n1- for door One\n2- for door Two\n3- for door Three");
		doorChoice = input.nextInt();
		
		
		if(doorChoice == 1) 
		{
			System.out.print("Door 1. Good choice. Choose among the following chests:");
			System.out.print("\n1 - For Chest One\n2 - For Chest Two");
			chestChoice = input.nextInt();
			if(chestChoice == 1)
			{
			result = "a pile of gold";
			}
			else if(chestChoice == 2) 
			{
				result = "nothing, it was empty. Hahahahahaha!";
			}
			else if(chestChoice == 3) {
			System.out.println("You find a special hidden room with 3 books on the table, there are no"
					+ " words on their covers. Do you choose Book 1 Book 2, or Book 3?");
			bookChoice = input.nextInt();
			if (bookChoice == 1)
			{
				result = "a book full of bees";
			}
			else if (bookChoice == 2)
			{
				result = "a blank book";
			}
			else if (bookChoice == 3)
			{
				result = "a book full of satanic rituals. You regret looking upon the book";
			}
			}
			else
				result = "a huge pile of gold. Just kidding, I said 1 or 2! " + chestChoice +
				" was not an option. Now you die!";
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
		System.out.println("You won " + result + "!");
	}
}
