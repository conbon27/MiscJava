package study;

public class AnimalTest {

	public static void main(String[] args) {

		Beagle bea = new Beagle();
		Siamese sia = new Siamese();

		bea.SetName("Bae");
		sia.SetName("Sia");

		System.out.println(bea.getName() + System.lineSeparator() + bea.sound());
		bea.fetch("bone");

		System.out.println(sia.getName() + System.lineSeparator() + sia.Sound());
		sia.climb("fish");

	} // closes main

} // closes class
