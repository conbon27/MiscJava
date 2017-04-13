package study;

import java.io.Serializable;
import java.text.DecimalFormat;

public abstract class Employee implements Serializable {

	private String name;
	private String ppsNumber;
	private int employeeNumber;
	static int numberOfEmployees = 2;
	protected double pay;
	DecimalFormat format = new DecimalFormat("0");

	public Employee() {
		this.name = name;
		this.ppsNumber = ppsNumber;
		this.employeeNumber = employeeNumber;
	} // constructor introduced for private instance variables.

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPPS() {
		return ppsNumber;
	}

	public void setPPS(String ppsNumber) {
		this.ppsNumber = ppsNumber;
	}

	@Override
	public String toString() {
		return getName() + getPPS() + pay;
	}

	// toString set in order to print out the following in the subclass tester
	abstract double earnings();
} // closes class
