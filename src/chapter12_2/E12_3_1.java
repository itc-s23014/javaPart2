package chapter12_2;

import java.util.HashSet;

public class E12_3_1 {
    public static void main(String[] args) {
        var set = new HashSet<User>();
        set.add(new User("ab123","田中"));
        set.add(new User("ab224","佐藤"));
        set.add(new User("ab224","佐藤おさむ"));
        set.add(new User("ac331","木村"));
        set.forEach(System.out::println);
    }
}
