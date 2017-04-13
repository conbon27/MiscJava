package study;

import java.util.Arrays;
import java.util.Random;

public class Dice {

	public static void main(String[] args) {

		Random dice = new Random();
		int number;

		for (int counter = 1; counter <= 10; counter++) {
			number = 1 + dice.nextInt(6);
			System.out.println(number + " ");
		}

		Random rand = new Random();
		int freq[][] = new int[7][7];

		for (int roll = 1; roll <= 10; roll++) {
			++freq[1 + rand.nextInt(6)][1 + rand.nextInt(6)];
			System.out.println(Arrays.deepToString(freq));
		}
	}

}
