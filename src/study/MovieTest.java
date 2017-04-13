package study;

import java.util.ArrayList;

public class MovieTest {

	public static void main(String[] args) {
		ArrayList<Movie> film = new ArrayList<Movie>();
		// creates new array list of type Movie.
		film.add(new Drama(1, "Mew", "12A"));
		film.add(new Drama(2, "try", "16"));
		System.out.println(film);
		System.out.println(film.toString());
		for (Movie e : film) {
			System.out.println(e.toString());
		}

	}

}
