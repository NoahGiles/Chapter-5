package Excercises;
	
//big mess of code. Unfinished?

import java.util.Scanner;

public class Pay {
	
	public static void main(String[] args)
	{
		int skill; 
		double hours;
		int insurance;
		double payRate = 0;
		int retirement = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please insert your skill level, from 1 to 3 >> ");
		skill = input.nextInt();
		System.out.print("Please insert a number of weekly hours worked >> ");
		hours = input.nextInt();
		
		if(skill == 1) {
			payRate = 17;
			payRates(hours, payRate, 0, 0);
		}
		else if(skill == 2){
			payRate = 20;
			payRates(hours, payRate, 1, 0);
		}
		else if(skill == 3){
			payRate = 22;
			payRates(hours, payRate, 1, 1);
			}
		else
			System.out.println("Invalid skill level.");
		
	}
	public static void payRates(double hours, double payRate, int insurance, int retirement) {
		double totalPay = 0;
		int insurancePlan;
		double insuranceCost = 0;
		double retirementBonus = 0;
		if (insurance == 1)
		{
			System.out.println("Please choose an insurance plan\n1. Medical insurance\n2. Dental insurance\n3. Long-term disability insurance");
			Scanner input = new Scanner(System.in);
			insurancePlan = input.nextInt();
			if (insurancePlan == 1)
			{
				insuranceCost =	32.50;
			}
			else if (insurancePlan == 2)
			{
				insuranceCost = 20.00;
			}
			else if (insurancePlan == 3)
			{
				insuranceCost = 10.00;
			}
			if (retirement == 1)
			{
				retirementBonus = 1.03;
			}
			
		}
		if (hours >= 40)
		{
		totalPay = (hours * payRate + ((hours - 40) * (payRate)) * retirementBonus) - insuranceCost;
		
		}
		else if(hours < 40)
		{
			totalPay = (hours * payRate + ((hours - 40) * (payRate * 1.5))  * retirementBonus) - insuranceCost;
		}
		System.out.println("Your gross pay is $" + totalPay + ".");
	}
}








