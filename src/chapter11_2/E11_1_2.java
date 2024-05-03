package chapter11_2;

import java.util.List;

public class E11_1_2 {
    public static void main(String[] args) {
        //色が緑の場合のラムダ式
        testApple(a -> a.color().equals("green"));
        //色が赤で、重さが320以上の場合のラムダ式
        testApple(a -> a.color().equals("red")&&a.weight()>=320);
    }
    public static void testApple (Predicate p) {
        var list = getAppleList();
        for (Apple apple : list) {
            if (p.test(apple))
                System.out.println(apple);
        }

    }

    public static List<Apple> getAppleList() {
        var list = List.of(
                new Apple(320,"red"),
                new Apple(280,"green"),
                new Apple(350,"green"),
                new Apple(330,"red"),
                new Apple(250,"red")
        );
        return list;
    }
}
