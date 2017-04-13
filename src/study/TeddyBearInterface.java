package study;

public interface TeddyBearInterface {

	public String getManufacturer();

	public void setManufacturer(String maker);

	public String getColour();

	public void setColour(String col);

	public int getYearOfManufacture();

	public void setYearOfManufacture(int year);
	// no need to initialize constructors for an interface
	// all will be done in the class that implements' methods
}// closes interface
