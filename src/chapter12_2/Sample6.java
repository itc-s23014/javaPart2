package chapter12_2;

import java.util.HashMap;

public class Sample6 {
    public static void main(String[] args) {

        var map = new HashMap<Integer, String>();
        map.put(205,"田中");
        map.put(100,"木村");
        map.put(300,"佐藤");



        map.forEach((k,v) ->System.out.println(k + "" + v));
    }
}
