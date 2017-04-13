package study;

public class Knine extends Creature {

	public Knine(String name, int size) {
		super(name, name, size);
	}

	@Override
	public String sound() {
		return "bark, bark";
	}

}
