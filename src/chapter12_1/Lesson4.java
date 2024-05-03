package chapter12_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lesson4 {
    public static void main(String[] args) {
        List<Mountain> mountains = new ArrayList<>();
        mountains.add(new Mountain("huzisan",14255));
        mountains.add(new Mountain("kitadake",14433));
        mountains.add(new Mountain("akazan",14156));
        mountains.add(new Mountain("midorizan",14265));



       mountains.sort(Comparator.comparing(Mountain::getHeight).reversed());
       mountains.forEach(System.out::println);
       mountains.sort(Comparator.comparing(Mountain::getName));
       mountains.forEach(System.out::println);


    }
}
