package study;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ContactTest {

	public static void main(String[] args) {

		List<Contact> contacts = new LinkedList<Contact>();
		Contact contact = new Contact("Jones", "JD", "091230", "@sdf");
		contacts.add(0, contact);

		for (Contact x : contacts) {
			System.out.println(x.getEmailAddress());
		}

		ListIterator<Contact> itr = contacts.listIterator();
		while (itr.hasNext()) {
			// System.out.println(contact.getFirstName() + " " +
			// contact.getEmailAddress());
		}

	} // closes main

} // closes class
