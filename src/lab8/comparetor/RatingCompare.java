package lab8.comparetor;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie> {


    @Override
    public int compare(Movie left, Movie right) {
        if (left.getRating() > right.getRating()) {
            return 1;
        } else if (left.getRating() < right.getRating()) {
            return -1;
        } else {
            return 0;
        }
    }
}
