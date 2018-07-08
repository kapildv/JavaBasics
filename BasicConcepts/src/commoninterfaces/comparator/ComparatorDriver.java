package commoninterfaces.comparator;

import commoninterfaces.comparable.Movie;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDriver {

    /*
    To summarize, if sorting of objects needs to be based on natural order then use Comparable
     whereas if you sorting needs to be done on attributes of different objects,
     then use Comparator in Java.
     */

    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        System.out.println("Sorted by rating");
        MovieRatingComparator ratingCompare = new MovieRatingComparator();
        Collections.sort(list, ratingCompare);
        System.out.println("Movies after sorting : ");
        for (Movie movie : list) {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }

        System.out.println("Sorted by Name");
        MovieNameComparator nameCompare = new MovieNameComparator();
        Collections.sort(list, nameCompare);
        System.out.println("Movies after sorting by Name : ");
        for (Movie movie : list) {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }

        System.out.println("\nSorted by year");
        Collections.sort(list);
        for (Movie movie : list)
            System.out.println(movie.getYear() + " " +
                    movie.getRating() + " " +
                    movie.getName() + " ");

    }
}
