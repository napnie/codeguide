package codeguide;

import java.util.Scanner;

/**
 * An Boy Scout Rule exercise for the students to understance it.
 * @author Nitith Chayakul
 *
 */
public class BoyScoutRule_exercise {
	
	/**
	 * This program receive an input of number and find out what is a maximum value of those number. 
	 * TODO check the code and see if you can improve it.
	 * @param arg
	 */
	public static void main(String[]arg) {
		//This variable's name is over simplify, maybe there is a more appropriate name?
		Scanner s = new Scanner(System.in);
		
		//This program require user to input how many number there is and then input each number one by one.
		//Perhaps you can make it input an only single long string of number[e.g. 2 3 5 6 8 7 9] instead? 
		double[] numArray = new double[s.nextInt()];
		for (int i=0 ; i<numArray.length ; i++){
			numArray[i] = s.nextDouble();
		}
		
		//Could you make the loop simpler?
		System.out.println("Max:");
		double max = numArray[0];
		for (int i=0 ; i<numArray.length ; i++){
			max = Math.max(numArray[i],max);
		}
		System.out.print(max);
	}
}
