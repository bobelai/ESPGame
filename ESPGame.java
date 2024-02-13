/*
 * Class: CMSC203 
 * Instructor: Dr. Grinberg
 * Description: Main class executes a color-guessing game for a single player. 
 * Due: 02/12/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or   
 * any source. I have not given my code to any student.
 * Print your Name here: Leul Belay
*/

import java.util.Scanner;
import java.util.Random;

public class ESPGame {

	public static void main(String[] args) {
		// Define color constants
		final String COLOR_RED = "Red";
		final String COLOR_PURPLE = "Purple";
		final String COLOR_BLUE = "Blue";
		final String COLOR_GREEN = "Green";
		final String COLOR_WHITE = "White";
		final String COLOR_BLACK = "Black";
		final String COLOR_YELLOW = "Yellow";

		// Set the number of rounds
		final int numofRounds = 11;

		int correctGuesses = 0; // Counter for correct guesses

		Scanner scanner = new Scanner(System.in);

		// Random object for generating random numbers
		Random random = new Random();

		// Obtain user information
		System.out.print("Enter your name: ");
		String userName = scanner.nextLine();
		
		System.out.print("Enter your MC M#: "); 
		String userMCid = scanner.nextLine(); 

		System.out.print("Describe yourself: ");
		String userDescription = scanner.nextLine();

		System.out.print("Due Date (MM/DD/YYYY): ");
		String userDuedate = scanner.nextLine();
		

		// Game introduction
		System.out.println("CMSC203 Assignment1: Test your ESP skills! ");

		// Game loop begins, iterates through each 11 rounds
		for (int round = 1; round <= numofRounds; round++) {
			System.out.println("Round " + round);
			System.out.println();
			System.out.println("I am thinking of a color.");
			System.out.println("Is it Red, Purple, Blue, Green, White, Black, or Yellow?");

			int randomNumber = random.nextInt(7); // Generate random number for color
			String selectedColor = "";

			// Assign a color based on the random number generated
			switch (randomNumber) {
			case 0:
				selectedColor = COLOR_RED;
				break;
			case 1:
				selectedColor = COLOR_PURPLE;
				break;
			case 2:
				selectedColor = COLOR_BLUE;
				break;
			case 3:
				selectedColor = COLOR_GREEN;
				break;
			case 4:
				selectedColor = COLOR_WHITE;
				break;
			case 5:
				selectedColor = COLOR_BLACK;
				break;
			case 6:
				selectedColor = COLOR_YELLOW;
				break;
			}

			// Prompt the user to enter their guess and then reads it
			System.out.println("Enter your guess: ");
			String userGuess = scanner.nextLine();

			// Compare user's guess with selected color, if right then increments the
			// correctGuesses counter
			// Use of equalsIgnoreCase to compare without case sensitivity of user input
			if (userGuess.equalsIgnoreCase(selectedColor)) {
				correctGuesses++;
			}

			// Reveals the correct color
			System.out.println();
			System.out.println("I was thinking of " + selectedColor + ".");

		}

		System.out.println();
		System.out.println("Game Over \n\n");

		// Display how many the user guessed right
		System.out.println("You guessed " + correctGuesses + " out of " + numofRounds + " colors correctly.");

		// Display user information
		System.out.println("Student name : " + userName);
		System.out.println("MC ID : " + userMCid); 
		System.out.println("User Description: " + userDescription);
		System.out.println("Due Date: " + userDuedate);

	}
}
