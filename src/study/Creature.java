package study;

import java.io.Serializable;

public abstract class Creature implements Serializable {

	private String type;
	private String name;
	private int size;

	public Creature(String type, String name, int size) {
		this.type = type;
		this.name = name;
		this.size = size;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setType(String type) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	abstract String sound();

	@Override
	public String toString() {
		return getName() + " " + getSize() + " " + getType() + " " + sound();
	}
}// closes abstract class
