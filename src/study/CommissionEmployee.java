package study;

public class CommissionEmployee extends Employee {

	private final double COMMISSION_RATE = .1;
	private double sales;

	public CommissionEmployee() {
	}

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}

	@Override
	double earnings() {
		return COMMISSION_RATE * sales;
	} // ends overridden method from parent

} // ends class
