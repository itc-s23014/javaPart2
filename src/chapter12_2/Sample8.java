package chapter12_2;

import java.util.HashMap;

public class Sample8 {
    public static void main(String[] args) {

        var map = new HashMap<Integer,String>();
        map.put(0,"java");
        map.put(1,"Kotlin");
        map.put(2,"python");

        map.forEach((k,v)->System.out.println(k + "" + v));



    }
}
