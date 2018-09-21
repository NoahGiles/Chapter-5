package Excercises;

import java.util.Scanner;

public class CondoSales {
	
	public static void main(String[] args)
	{
	
		//Park View is 150000
		//Golf Course is 170000
		//Lake View is 210000
		int userChoice;
		Scanner input = new Scanner(System.in);
		System.out.println("Would you like to purchase a \n1. park view condo\n2. golf course condo\n3. lake view condo");
		userChoice = input.nextInt();
		if (userChoice == 1) {
			System.out.print("Cost : $150,000");
		}
		else if (userChoice == 2) {
			System.out.print("Cost : $170,000");
		}
		else if (userChoice == 3) {
			System.out.print("Cost : $210,000");
		}
		if (userChoice >= 1 && userChoice <= 3)
		{
			
		}
		else {
			System.out.print("Cost : $0");
		}
	
	}
}
