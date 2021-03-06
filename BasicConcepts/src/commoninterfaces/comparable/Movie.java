package commoninterfaces.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Movie implements Comparable<Movie> {

    /*
     * A comparable object is capable of comparing itself with another object.
     * The class itself must implements the java.lang.Comparable
     * interface to compare its instances.
     * */

    private double rating;
    private String name;
    private int year;

    public Movie(String nm, double rt, int yr) {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    @Override
    public int compareTo(Movie movie) {

        System.out.println(this.rating + " " + movie.rating);
        return (int) (this.rating - movie.rating);
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8, 2015));
        list.add(new Movie("Star Wars", 9, 1977));
        list.add(new Movie("Empire Strikes Back", 7, 1980));
        list.add(new Movie("Return of the Jedi", 6, 1983));

        Collections.sort(list);
        System.out.println("Movies after sorting : ");
        for (Movie movie : list) {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }
    }

}
