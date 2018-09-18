package practice;

import java.util.Scanner;

public class AgeGame 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int usersAge;
		String result;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your age to be insulted");
		usersAge = input.nextInt();
		
		if (usersAge <= 12)
		{
			result = "You are a child.";
		}
		else if(usersAge >= 13 && usersAge <= 18)
		{
			result = "You are but a teenager";
		}
		else if(usersAge >= 19 && usersAge <= 25)
		{
			result = "You need to get a job";
		}
		else if(usersAge >= 26 && usersAge <= 30)
		{
			result = "You REALLY need to get a job";
		}
		else if(usersAge >= 31 && usersAge <= 40)
		{
			result = "You're too old to be playing these games";
		}
		else if(usersAge >= 41 && usersAge <= 50)
		{
			result = "Your grandchildren aren't going to play with themselves, you know.";
		}
		else if(usersAge >= 51 && usersAge <= 60)
		{
			result = "The retirement home is looking for you.";
		}
		else if(usersAge >=61)
		{
			result = "Don't you have a morgue to be at?";
		}
	}
	public static void displayMessage(String result)
	{
		System.out.println(result);
	}
}
