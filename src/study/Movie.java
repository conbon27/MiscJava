package study;

public abstract class Movie {

	private static int idNumber;
	private String title;
	private String classification;

	public Movie() {
		this(0, "None", "N/A");
	}

	public Movie(int idNumber, String title, String classification) {
		Movie.idNumber = idNumber;
		this.title = title;
		this.classification = classification;
	}

	public static int getIdNumber() {
		return idNumber;
	}

	public String getTitle() {
		return title;
	}

	public String getClassification() {
		return classification;
	}

	public void setIdNumber(int idNumber) {
		Movie.idNumber = idNumber;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	abstract double calculateLateFee(int numDaysLate);

	@Override
	public String toString() {
		return getTitle() + " " + getClassification();
	}
} // end class
