package lab8.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("Force awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1997));
        list.add(new Movie("Emprie Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the jedi", 8.4, 1983));
        Collections.sort(list);

        System.out.println("Movie after sorting : ");
        for (Movie movie : list) {
            System.out.println(movie.getName() + " " + movie.getRating() + " " +
                    movie.getYear());
        }
    }
}
