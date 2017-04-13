package study;

import java.util.Scanner;

public class Bee { // program to reverse the text that has been entered.
	public static void main(String[] args) {

		String line;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter line of text to be reversed: ");
		line = input.nextLine();
		System.out.println("You have selected: " + line);
		String reverse = new StringBuffer(line).reverse().toString();
		System.out.println("Line reversed: " + reverse);
		input.close();
	} // closes main
}// closes class
