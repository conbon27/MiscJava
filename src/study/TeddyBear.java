package study;

public class TeddyBear {

	private String manufacturer;
	private String colour;
	private int yearOfManufacture;

	public TeddyBear() {
		this("NoName", "N/A", 0);
	} // defaults set for constructor

	public TeddyBear(String manufacturer, String colour, int yearOfManufacture) {
		this.manufacturer = manufacturer;
		this.colour = colour;
		this.yearOfManufacture = yearOfManufacture;
	} // public accessors to be used in below getters/setters.

	public String getManufacturer() {
		return manufacturer;
	}

	public void SetManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	@Override
	public String toString() {
		return getManufacturer() + " " + getColour() + " " + getYearOfManufacture();
	};
}
