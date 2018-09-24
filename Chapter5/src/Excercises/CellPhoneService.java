package Excercises;

import java.util.Scanner;

public class CellPhoneService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int minutes;
		int messages;
		double data;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please insert a number of minutes of talk, messages sent, and gigabytes used >> ");
		
		System.out.println("Minutes >> ");
		minutes = input.nextInt();
		System.out.println("Messages >> ");
		messages = input.nextInt();
		System.out.println("Gigabytes >> ");
		data = input.nextDouble();
		
		if (minutes <= 500 || data == 0)
		{
			System.out.println("We recommend Plan A, for $49 per month.");
		}
		else if (minutes <= 500 || messages >= 1 || messages < 80)
		{
			System.out.println("We recommend Plan B, for $55 per month.");
		}
		else if (minutes >= 500 || data == 0 || messages >= 1 || messages <= 100)
		{
			System.out.println("We recommend Plan C, for $61 per month.");
		}
		else if (minutes >= 500 || data == 0|| messages >= 80 || messages >= 100)
		{
			System.out.println("We recommend Plan D, for $70 per month.");
		}
		else if (data < 2 || data > .01)
		{
			System.out.println("We recommend Plan E, for $79 per month.");
		}
		else if (data >= 2)
		{
		System.out.println("We recommend Plan F, for $87 per month.");
		}	
	}

}
