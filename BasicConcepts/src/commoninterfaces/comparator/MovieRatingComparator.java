package commoninterfaces.comparator;

import commoninterfaces.comparable.Movie;

import java.util.Comparator;

public class MovieRatingComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie m1, Movie m2) {
        if (m1.getRating() < m2.getRating()) return -1;
        if (m1.getRating() > m2.getRating()) return 1;
        else return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
