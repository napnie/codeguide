package codeguide;

import java.util.Scanner;

/**
 * An Do The Simplest Thing That Could Possibly Work exercise for the students to understance it.
 * @author Nitith Chayakul
 *
 */
public class DoTheSimplestThingThatCouldPossiblyWork_exercise {
	
	/**
	 * This program receive 2 integer value and print odd number between those 2 value.
	 * TODO check the code and see if you can improve it.
	 * @param arg
	 */
	public static void main(String[]arg) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("This program will print odd number from x to y or from y to x; consider boht x and y is integer:");
		System.out.print("Input x:");
		int x = scan.nextInt();
		System.out.print("Input y:");
		int y = scan.nextInt();
		System.out.println("\n--------------------------------------");
		
		//Is there a way to reduce this logic?
		int max,min;
		if ( x >= y) {
			max = x;
			min = y;
		} else {
			max = y;
			min = x;
		}
		
		for (int i=x ; i<y ; i++ ) {
			if (i%2 != 0) System.out.printf("%d, ",i);
		}
	}
}
