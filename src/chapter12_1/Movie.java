package chapter12_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Movie {
    private String title;
    private double revenue;
    private int year;

    public String getTitle() {
        return title;
    }

    public double getRevenue() {
        return revenue;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", revenue=" + revenue +
                ", year=" + year +
                '}';
    }

    public Movie(String title, double revenue, int year) {
        this.title = title;
        this.revenue = revenue;
        this.year = year;
    }
}

    


