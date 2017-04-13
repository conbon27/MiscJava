package study;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.ListIterator;

public class Client {

	public static void main(String[] args) {
		LinkedList<Employee> tester = new LinkedList<Employee>();

		CommissionEmployee comm = new CommissionEmployee();
		comm.setName("JD");
		comm.setPPS("123D");
		comm.setSales(1010);

		tester.add(0, comm);

		HourlyEmployee hour = new HourlyEmployee();
		hour.setName("AE");
		hour.setPPS("234E");
		hour.setHoursWorked(240);

		tester.add(1, hour);

		System.out.println(comm.earnings() + System.lineSeparator() + hour.earnings());

		for (Employee z : tester) {
			System.out.println(z);
		}
		ListIterator<Employee> iter = tester.listIterator();
		while (iter.hasNext()) {
			System.out.println(iter);
		}
		try {
			// create a connection stream (write bytes)
			FileOutputStream fileStream = new FileOutputStream("EmployeeInfo.dat");
			// create a chain stream (allows objects to be written to a stream)
			ObjectOutputStream os = new ObjectOutputStream(fileStream);
			// call writeObject() on the Object stream
			os.writeObject(tester);
			// write tester to file
			os.close();
			// closes tool
		} // closes try
		catch (Exception e) {
			e.printStackTrace();
			// catches & prints any error
		} // closes catch

		try {
			FileInputStream fileStream = new FileInputStream("EmployeeInfo.dat");
			// recreates a connection stream
			ObjectInputStream os = new ObjectInputStream(fileStream);
			// allows objects to be read from a stream
			LinkedList<Employee> an = (LinkedList<Employee>) os.readObject();
			// creates new array of array type Animal & reads in data
			for (Employee element : an) {
				System.out.println(element.toString());
				// prints out content of new array = pre-serialized
			}
			os.close();
			// closes tool
		} catch (Exception e) {
			e.printStackTrace();
			// catches & prints any error
		} // closes catch
	} // closes main
} // closes class
