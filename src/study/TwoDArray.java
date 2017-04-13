package study;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {

		String rows = "John";
		String columns = "Smith";
		String[][] name = new String[][] { { rows, columns }, { rows, columns } };
		System.out.println(Arrays.deepToString(name));
	}
}
