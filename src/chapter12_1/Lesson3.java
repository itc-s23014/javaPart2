package chapter12_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lesson3 {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Avator",29,2009));
        movies.add(new Movie("titanic",22.647,1997));
        movies.add(new Movie("Spider-man",19.218,2021));
        movies.add(new Movie("frozen",13.343,2013));
        movies.add(new Movie("2021",7.921,2009));
        movies.sort(Comparator.comparing(Movie::getTitle));


    }
}
