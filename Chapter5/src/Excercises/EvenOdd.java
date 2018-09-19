package Excercises;

import java.util.Scanner;

public class EvenOdd
{

	public static void main(String[] args)
	{
		int x;
		String result = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Please insert an integer >> ");
		x = input.nextInt();
	
		if (x % 2 == 0)
	{
		result = "even";
	}
		else
			result = "odd";
		
		evenOdd(result);
	}
	public static void evenOdd(String result)
	{
		System.out.print("The number is " + result + ".");
	}
}
