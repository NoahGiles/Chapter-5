package gameZone;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userChoice;
		int computerChoice;

		
		Scanner input = new Scanner(System.in);
		computerChoice = (int)(Math.random() * 3 + 1);
		System.out.println("Rock (1), paper (2), or scissors (3)?");
		userChoice = input.nextInt();
			if (userChoice == 1)
				{
					if (computerChoice == 1)
					{
						System.out.println("Computer chose rock. You tied!");
					}
					else if (computerChoice == 2)
					{
						System.out.println("Computer chose paper. You lost!");
					}
					else if (computerChoice == 3)
					{
						System.out.print("Computer chose scissors. You won!");
					}
				}
			else if (userChoice == 2)
				{
					if (computerChoice == 1)
					{
					System.out.println("Computer chose rock. You won!");
					}
					else if (computerChoice == 2)
					{
					System.out.println("Computer chose paper. You tied!");
					}
					else if (computerChoice == 3)
					{
						System.out.println("Computer chose scissors. You lost!");
					}
				}
			else if (userChoice == 3)
				{
					if (computerChoice == 1)
					{
					System.out.println("Computer chose rock. You lost!");
					}
					else if (computerChoice == 2)
					{
					System.out.println("Computer chose paper. You won!");
					}
					else if (computerChoice == 3)
					{
					System.out.println("Computer chose scissors. You tied!");
					}
				}
			else
				System.out.println("Nothing happens.");
			}
	}


