package chapter11_2;

import java.util.function.Function;


public class FunExample {
    public static void main(String[] args) {

        Function<String,Integer> func1 = String::length ;
        System.out.println(func1.apply("Hello"));
    }
}
