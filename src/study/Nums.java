package study;

import java.util.Scanner;

public class Nums { // checks if number is odd or even

	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no. to check: ");
		num = input.nextInt();
		if (isEven(num) == true) {
			System.out.println();
		}
		;

		input.close();
	} // closes main

	public static boolean isEven(int q) {
		boolean isEven = false;
		if (q % 2 == 0) {
			System.out.println(q + " is even");
			isEven = true;
		} else {
			System.out.println(q + " is odd");
			isEven = false;
		}
		return isEven;
	}// closes method

} // closes class
