package Excercises;

import java.util.Scanner;

public class CondoSales {
	
	public static void main(String[] args)
	{
	
		//Park View is 150000
		//Golf Course is 170000
		//Lake View is 210000
		int userChoice;
		int userChoice2;
		Scanner input = new Scanner(System.in);
		System.out.println("Would you like to purchase a \n1. park view condo\n2. golf course condo\n3. lake view condo");
		userChoice = input.nextInt();
		if (userChoice == 1) {
			System.out.print("Cost : $150,000");
			
			System.out.print("\nNow would you like to purchase a \n1. parking space\n2. garage");
			userChoice2 = input.nextInt();
			if (userChoice2 == 1 || userChoice2 > 2)
			{
			System.out.println("Cost : $150,000");
			}
			if (userChoice2 == 2)
			{
			System.out.print("Cost : $155,000");	
			}
		}
		if (userChoice == 2) {
			System.out.print("Cost : $170,000");
			
			System.out.print("\nNow would you like to purchase a \n1. parking space\n2. garage");
			userChoice2 = input.nextInt();
			if (userChoice2 == 1 || userChoice2 > 2)
			{
			System.out.println("Cost : $170,000");
			}
			if (userChoice2 == 2)
			{
			System.out.print("Cost : $175,000");	
			}
		}
		if (userChoice == 3) {
			System.out.print("Cost : $210,000.");
			
			System.out.print("\nNow would you like to purchase a \n1. parking space\n2. garage");
			userChoice2 = input.nextInt();
			if (userChoice2 == 1 || userChoice2 > 2)
			{
			System.out.println("Cost : $210,000");
			}
			if (userChoice2 == 2)
			{
			System.out.print("Cost : $215,000");	
			}
			}
		

		else if (userChoice > 3) {
			System.out.print("Cost : $0");
		}
	}
}