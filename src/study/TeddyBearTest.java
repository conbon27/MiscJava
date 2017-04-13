package study;

import java.util.ArrayList;
import java.util.ListIterator;

public class TeddyBearTest {

	public static void main(String[] args) {

		ArrayList<TeddyBear> alist = new ArrayList<TeddyBear>();
		alist.add(new TeddyBear("Fluffy", "Red", 1989));
		alist.add(new TeddyBear("Clyde", "Blue", 1990));

		System.out.println("Contents of the array list are: ");
		// prints text ahead of enhanced for loop condition
		for (TeddyBear z : alist) {
			// enhanced for loop condition stating for every z in list
			System.out.println(z);
		} // closes loop

		alist.remove(1);
		// removes the forth place of the stuff index

		ListIterator<TeddyBear> itr = alist.listIterator();
		// brings in the list iterator to cycle through the array list
		System.out.println("Following removal, Array list iterator outputs: ");
		// prints text ahead of enhanced while loop
		while (itr.hasNext()) {
			// while loop to say that while there is another element to iterate
			System.out.println(itr.next());
			// print out the contents of the list
		} // closes while loop
	} // closes main

} // closes class
