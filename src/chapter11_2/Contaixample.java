package chapter11_2;

import java.util.function.Predicate;

public class Contaixample {
    public static void main(String[] args) {
        String words = "apple banana cherry peach";
        Predicate<String> x = (words::contains);
        System.out.println(x.test("banana"));
    }
}
