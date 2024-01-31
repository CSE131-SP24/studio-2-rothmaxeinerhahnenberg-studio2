package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How much money do you start with?");
		double startAmount = in.nextDouble();
		System.out.println("What is your win chance?");
		double winChance = in.nextDouble();
		System.out.println("How much do you want to earn?");
		double winLimit = in.nextDouble();
		
		int totalSimulations = 0;
		
		while ((startAmount < winLimit) && (startAmount > 0))
		{
			double simulationChance = Math.random();
			totalSimulations++;
			
			if (simulationChance < winChance)
			{
				startAmount++;
				System.out.println("Simulation " + totalSimulations + ": " + startAmount + " WIN");
			}
			else
			{
				startAmount--;
				System.out.println("Simulation " + totalSimulations + ": " + startAmount + " LOSE");
			}
		}
		
		if (startAmount == 0)
		{
			System.out.println("RUIN!");
		}
		else if (startAmount >= winLimit)
		{
			System.out.println("You win!");
		}
		
		System.out.println("Total Simulations: " + totalSimulations);
		double expectedRuin = (1-(startAmount/winLimit));
		System.out.println("Ruin rate from simulation: " +expectedRuin);
		
	}
}