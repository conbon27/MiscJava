package study;

public class Cat extends Animal {

	@Override
	String sound() {
		// TODO Auto-generated method stub
		return null;
	} // unimplemented method must be added to all subclasses from super

	public void climb(String item) {
		item = "tree";
		System.out.println("I'm climbing a " + item);
	} // closes method
} // closes class
