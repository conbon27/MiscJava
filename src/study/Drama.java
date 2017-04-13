package study;

import java.util.Scanner;

public class Drama extends Movie {

	public Drama() {
	}

	public Drama(int IdNumber, String title, String classification) {
		super();
	}

	@Override
	double calculateLateFee(int numDaysLate) {
		Scanner in = new Scanner(System.in);
		int choice = 0;
		int lateFee;
		System.out.println("Enter choice (Select 3): ");
		choice = in.nextInt();
		if (choice == 1) {
			lateFee = 5;
		} else if (choice == 2) {
			lateFee = 4;
		} else if (choice == 3) {
			lateFee = 3;
		} else {
			lateFee = 6;
		}
		System.out.println("No. of days late: ");
		numDaysLate = in.nextInt();
		in.close();
		int charge = numDaysLate * lateFee;
		return charge;
	}
}
