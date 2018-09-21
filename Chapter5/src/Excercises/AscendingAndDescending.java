package Excercises;

import java.util.Scanner;

public class AscendingAndDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int num3;
		int high = 0;
		int medium = 0;
		int low = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Please insert a first number >> ");
		num1 = input.nextInt();
		System.out.print("Please insert a second number >> ");
		num2 = input.nextInt();
		System.out.print("Please insert a third number >> ");
		num3 = input.nextInt();		
		

		if(num1 <= num2 && num1 <= num3)
		{
			low = num1;
			
			if(num2 <= num3)
			{
			high = num3;
			medium = num2;
			}
			if (num2 >= num3)
			{
			high = num2;
			medium = num3;
		}
		}
		else if(num2 <= num1 && num2 <= num3)
		{
			low = num2;
			
		if(num3 >= num1)
		{
			high = num3;
			medium = num1;
		}	
		if (num3 <= num1);
		{
			high = num1;
			medium = num3;	
		}
		}
		else if(num3 <= num1 && num3 <= num2)
		{
			low = num3;
		
		if(num1 >= num2)
		{
			high = num1;
			medium = num2;
		}	
		if (num1 <= num2)
		{
			high = num2;
			medium = num1;
		}
		}
		System.out.println("High : " + high + " Medium : " + medium + " Low : " + low);
		
			}
		}

