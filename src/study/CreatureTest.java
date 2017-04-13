package study;

import java.util.LinkedList;
import java.util.ListIterator;

public class CreatureTest {

	public static void main(String[] args) {

		LinkedList<Creature> animals = new LinkedList<Creature>();
		Feline cat = new Feline("TJ", 25);
		animals.add(0, cat);
		Knine dog = new Knine("CJ", 87);
		animals.add(1, dog);

		System.out.println(cat.sound() + System.lineSeparator() + dog.sound());
		ListIterator<Creature> creats = animals.listIterator();
		while (creats.hasNext()) {
			System.out.println(creats.hasNext());
		}
	} // closes main

}// closes class
