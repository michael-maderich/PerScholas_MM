package controlflow;

import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {

		// Question 1
		int x = 7;
		if (x < 10) System.out.println("Less than 10");
		x = 15;
		if (x < 10) System.out.println("Less than 10");
		
		// Question 2
		x = 7;
		if (x < 10) System.out.println("Less than 10");
		else System.out.println("Greater than 10");
		x = 15;
		if (x < 10) System.out.println("Less than 10");
		else System.out.println("Greater than 10");
		
		// Question 3
		x = 15;
		if (x < 10) System.out.println("Less than 10");
		else if (x < 20) System.out.println("Between 10 and 20");
		else System.out.println("Greater than or equal to 20");
		x = 50;
		if (x < 10) System.out.println("Less than 10");
		else if (x < 20) System.out.println("Between 10 and 20");
		else System.out.println("Greater than or equal to 20");
		
		// Question 4
		x = 15;
		if (x < 10 || x > 20) System.out.println("Out of range");
		else System.out.println("In range");
		x = 5;
		if (x < 10 || x > 20) System.out.println("Out of range");
		else System.out.println("In range");
		
		// Question 5
		Scanner sin = new Scanner(System.in);
		int input = -1;
		do {
			System.out.print("\nPlease enter number grade from 0-100 to convert to letter grade:\n > ");
			try {
				input = sin.nextInt();
			}
			catch (Exception e) {
				sin.nextLine();
				System.out.println("\nInput error. Try again");
				input = -1;
			}
		} while (input == -1);
		if (input < 0) System.out.println("Score out of range");
		else if (input < 60) System.out.println("F");
		else if (input < 70) System.out.println("D");
		else if (input < 80) System.out.println("C");
		else if (input < 90) System.out.println("B");
		else if (input <=100) System.out.println("A");
		else System.out.println("Score out of range");

		// Question 6
		input = -1;
		do {
			System.out.print("\nPlease enter a number between 1 and 7 to convert to day of the week:\n > ");
			try {
				input = sin.nextInt();
			}
			catch (Exception e) {
				sin.nextLine();
				System.out.println("\nInput error. Try again");
				input = -1;
			}
		} while (input == -1);
		switch (input) {
			case 1:System.out.println("\nSunday");break;
			case 2:System.out.println("\nMonday");break;
			case 3:System.out.println("\nTuesday");break;
			case 4:System.out.println("\nWednesday");break;
			case 5:System.out.println("\nThursday");break;
			case 6:System.out.println("\nFriday");break;
			case 7:System.out.println("\nSaturday");break;
			default:System.out.println("Out of range");break;
		}
		sin.close();
	}

}
