package chapter12_2;

import java.util.HashMap;

public class Sample5 {
    public static void main(String[] args) {

        var map = new HashMap<Integer, String>();
        map.put(205,"田中");
        map.put(100,"木村");
        map.put(300,"佐藤");

        System.out.println(map.remove(300));
        System.out.println(map.remove(150));

        map.forEach((k,v) ->System.out.println(k + "" + v));
    }
}
