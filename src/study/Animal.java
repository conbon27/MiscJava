package study;

public abstract class Animal {
	private String name;

	public Animal() {
		name = null;
	} // public constructor

	public void SetName(String animalName) {
		this.name = animalName;
	}

	public String getName() {
		return name;
	}

	abstract String sound();
	// unimplemented method must be added to all subclasses from super
} // closes abstract class
