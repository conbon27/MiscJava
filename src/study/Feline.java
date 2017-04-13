package study;

public class Feline extends Creature {

	public Feline(String name, int size) {
		super(name, name, size);
	}

	@Override
	public String sound() {
		return "meow, meow";
	}
} // closes class
