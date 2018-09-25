package Excercises;

import java.util.Scanner;

public class Pay {
	
	public static void main(String[] args)
	{
		int skill;
		int hours;
		int insurance;
		Scanner input = new Scanner(System.in);
		System.out.println("Please insert your skill level, from 1 to 3 >> ");
		skill = input.nextInt();
		System.out.print("Please insert a number of weekly hours worked >> ");
		hours = input.nextInt();
		if (skill == 1 || skill == 2 || skill == 3)
		{
		if (skill == 1)
		{
			System.out.println("Hourly pay rate : $18.50");
		}
		else if (skill == 2 || skill == 3)
		{
		if (skill == 2)
		{
			if (skill == 2 && hours > 40)
			{
			System.out.println("Hourly pay rate : $30.00");
			}
		else
			System.out.println("Hourly pay rate : $20.00");
		}
		else if (skill == 3)
		{
		
			if (skill == 3 && hours > 40)
			{
				System.out.println("Hourly pay rate : $33.00");
			System.out.println("\nYou are also elligible for a retirement plan for 3% of your gross pay.");
			}
			else
				System.out.println("Hourly pay rate : $22.00");
			System.out.println("\nYou are also elligible for a retirement plan for 3% of your gross pay.");
		}
				System.out.println("\nPick between any of the following insurance options :\n1. Medical insurance\n2. Dental insurance"
						+ "\n3. Long-term disability insurance");
				insurance = input.nextInt();
				if (insurance == 1)
				{
					System.out.println("You've chosen medical insurance, for a weekly cost of $32.50.");
				}
				else if (insurance == 2)
				{
					System.out.println("You've chosen dental insurance, for a weekly cost of $20.00.");
				}
				else if (insurance == 3)
				{
					System.out.println("You've chosen long-term disability insurance, for a weekly cost of $10.00.");
				}
				}
				//hourly pay equation goes here.
				}
			else if (skill > 3)
			{
				System.out.println("You've chosen a non-existent skill level.");
			}
		}
	}

