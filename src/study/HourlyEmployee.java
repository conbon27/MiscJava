package study;

public class HourlyEmployee extends Employee {

	final int PAY_PER_HOUR = 15;
	private double hoursWorked;

	public HourlyEmployee() {
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	@Override
	double earnings() {
		// TODO Auto-generated method stub
		return PAY_PER_HOUR * hoursWorked;
	}
} // closes class
