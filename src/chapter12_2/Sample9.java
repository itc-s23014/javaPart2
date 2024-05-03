package chapter12_2;

import java.util.HashMap;
import java.util.TreeMap;

public class Sample9 {
    public static void main(String[] args) {

        var map = new TreeMap<Integer, String>();
        map.put(205,"田中");
        map.put(100,"木村");
        map.put(300,"佐藤");

    

        map.forEach((k,v) ->System.out.println(k + "" + v));
    }
}
