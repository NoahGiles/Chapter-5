package Excercises;
	//big mess of code
import java.util.Scanner;

public class Pay {
	
	public static void main(String[] args)
	{
		int skill; 
		int hours;
		int insurance;
		int retirement = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please insert your skill level, from 1 to 3 >> ");
		skill = input.nextInt();
		System.out.print("Please insert a number of weekly hours worked >> ");
		hours = input.nextInt();
		if (skill ==1)
		{
			
				System.out.println("Your gross pay is $" + (hours * 17));
		}
		else if (skill == 2 || skill == 3)
		{
			if (skill == 3)
			{
				
				System.out.println("\nYou are also elligible for a retirement plan for 3% of your gross pay. Would you like to participate"
						+ "in this?\n0 - No\n1 - Yes");
				retirement = input.nextInt();
			}
			System.out.println("\nPick between any of the following insurance options :\n1. Medical insurance\n2. Dental insurance"
					+ "\n3. Long-term disability insurance");
			insurance = input.nextInt();
				if (insurance == 1)
				{
					System.out.println("You've chosen medical insurance, for a weekly cost of $32.50.");
					if (skill == 2 && hours < 41)
					{
						System.out.println("Your gross pay is $" + (hours * 20 - 32.50));
					}
					else if (skill == 3 && hours < 41)
					{
						System.out.println("Your gross pay is $" + (hours * 22 - 32.50));
					}
					else if (skill == 2 && hours > 40)
					{
						System.out.println("Your gross pay is $" + (hours * 30 - 32.50));
					}
					else if (skill == 3 && hours > 40 && retirement == 0)
					{
						System.out.println("Your gross pay is $" + (hours * 33 - 32.50));
					}
					else if (skill == 3 && hours > 40 && retirement == 1)
					{
						System.out.println("Your gross pay is $" + ((hours * 1.03) * 33 - 32.50));
					}
					else if (skill == 3 && hours < 41 && retirement == 0)
					{
						System.out.println("Your gross pay is $" + (hours * 22 - 32.50));
					}
					else if (skill == 3 && hours < 41 && retirement == 1)
					{
						System.out.println("Your gross pay is $" + ((hours * 1.03) * 22 - 32.50));
					}

				else if (insurance == 2)
				{
					System.out.println("You've chosen dental insurance, for a weekly cost of $20.00.");
					if (skill == 2 && hours < 41)
					{
						System.out.println("Your gross pay is " + (hours * 20 - 20));
					}
					else if (skill == 3 && hours < 41)
					{
						System.out.println("Your gross pay is " + (hours * 22 - 20));
					}
					else if (skill == 2 && hours > 40)
					{
						System.out.println("Your gross pay is " + (hours * 30 - 20));
					}
					else if (skill == 3 && hours > 40 && retirement == 0)
					{
						System.out.println("Your gross pay is " + (hours * 33 - 20));
					}
					else if (skill == 3 && hours > 40 && retirement == 1)
					{
						System.out.println("Your gross pay is " + ((hours * 1.03) * 33 - 20));
					}
					else if (skill == 3 && hours < 41 && retirement == 0)
					{
						System.out.println("Your gross pay is " + (hours * 22 - 20));
					}
					else if (skill == 3 && hours < 41 && retirement == 1)
					{
						System.out.println("Your gross pay is " + ((hours * 1.03) * 22 - 20));
					}
					
				else if (insurance == 3)
				{
					System.out.println("You've chosen long-term disability insurance, for a weekly cost of $10.00.");
					if (skill == 2 && hours < 41)
					{
						System.out.println("Your gross pay is " + (hours * 20 - 10));
					}
					else if (skill == 3 && hours < 41)
					{
						System.out.println("Your gross pay is " + (hours * 22 - 10));
					}
					else if (skill == 2 && hours > 40)
					{
						System.out.println("Your gross pay is " + (hours * 30 - 10));
					}
					else if (skill == 3 && hours > 40 && retirement == 0)
					{
						System.out.println("Your gross pay is " + (hours * 33 - 10));
					}
					else if (skill == 3 && hours > 40 && retirement == 1)
					{
						System.out.println("Your gross pay is " + ((hours * 1.03) * 33 - 10));
					}
					else if (skill == 3 && hours < 41 && retirement == 0)
					{
						System.out.println("Your gross pay is " + (hours * 22 - 10));
					}
					else if (skill == 3 && hours < 41 && retirement == 1)
					{
						System.out.println("Your gross pay is " + ((hours * 1.03) * 22 - 10));
					}
					
				else if (insurance > 3)
				{
					System.out.println("You've chosen a non-existent insurance plan.");
				}
				}
			else if (skill > 3)
			{
				System.out.println("You've chosen a non-existent skill level.");
			}
	}
	}
	}
	}
}









