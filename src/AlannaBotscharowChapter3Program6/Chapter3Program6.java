package AlannaBotscharowChapter3Program6;
import java.util.Scanner;
/*
 * Alanna Botscharow
 * 10/18
 * Calculating energy
 */
public class Chapter3Program6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		//Prompt the user to enter the amount of water
			// M (kilograms) 
				//input
		
		System.out.println("Enter the amount of water: ");
			double m = input.nextDouble(); 
		
		//Prompt the user to enter the initial temperature. 
			//iT 
				//input
			
		System.out.println("Enter the initial temperature: ");
			double iT = input.nextDouble(); 
			
		//Prompt the user to enter the final temperature
			//fT
				//input
			
		System.out.println("Enter the final temperature: ");
			double fT = input.nextDouble(); 
	
		//Compute energy (q)
			//q = M * (fT - iT) * 4184
			
		double q = m * (fT - iT) * 4184;
		
		//Display the energy needed. 
		
		System.out.println("The amount of energy that is needed is: "+q);

	}

}
