package study;

import java.util.Scanner;

public class Rainfall {

	public static void main(String[] args) {

		double[] Rainfall = new double[12];
		// creates new array of type integer, sized 12.
		Scanner input = new Scanner(System.in);
		// imports new scanner to allow user input
		for (int i = 0; i < Rainfall.length; i++) {
			System.out.println("Please enter rainfall for this month: ");
			// Rainfall[i] = i;
			Rainfall[i] = input.nextDouble();
		} // asks user to populate rainfall readings which are passed into array
		int sum = 0;
		for (int z = 0; z < Rainfall.length; z++) {
			sum += Rainfall[z];
		}
		System.out.println(sum);
		double avg = sum / Rainfall.length;
		System.out.println("Average rainfall for the year is " + avg);
		input.close();
		// closes input to prohibit further user input
	} // closes main
} // closes class
