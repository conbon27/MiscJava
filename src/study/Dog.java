package study;

public class Dog extends Animal {

	@Override
	String sound() {
		return null;
	} // unimplemented method must be added to all subclasses from super

	public void fetch(String item) {
		item = "rock";
		System.out.println("I am fetching a " + item);

	} // closes method
} // closes class
