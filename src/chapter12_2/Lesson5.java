package chapter12_2;

import java.util.TreeSet;


public class Lesson5 {
    public static void main(String[] args) {

        var set = new TreeSet<Book>();


        set.add(new Book("hosiwotikamu"));
        set.add(new Book("konomisuteri"));
        set.add(new Book("unnoiihito"));

        set.forEach(System.out::println);
    }
}
