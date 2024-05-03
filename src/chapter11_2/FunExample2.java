package chapter11_2;

import java.util.function.Function;

public class FunExample2 {
    public static void main(String[] args) {

        Function<Integer,Double> x = i -> i /2.0;
        System.out.println(x.apply(5 ));
    }
}
