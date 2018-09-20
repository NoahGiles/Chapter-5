package Excercises;

import java.util.Scanner;

public class AscendingAndDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int num3;
		String result = null;
		Scanner input = new Scanner(System.in);
		System.out.print("Please insert a first number >> ");
		num1 = input.nextInt();
		System.out.print("Please insert a second number >> ");
		num2 = input.nextInt();
		System.out.print("Please insert a third number >> ");
		num3 = input.nextInt();		
		

		if(num1 <= num2 && num1 <= num3)
		{
			
			//low number has to be num1
			if(num2 <= num3)
			{
			result = num3 + " " + num2 + " " + num1;
			}
		}
		else if(num2 <= num1 && num2 <= num3)
		{
			
		if(num3 >= num1)
		{
			result = num3 + " " + num1 + " " + num2;
		}
		}
		else if(num3 <= num1 && num3 <= num2)
		{
		
		if(num1 >= num2)
		{
			result = num1 + " " + num2 + " " + num3;
		}
		
			}
		}

}
