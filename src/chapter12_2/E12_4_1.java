package chapter12_2;

import java.util.HashMap;

public class E12_4_1 {
    public static void main(String[] args) {

        var map = new HashMap<String,User>();

        User u1 = new User("ab123","田中");
        User u2 = new User("ab224","佐藤");
        User u3 = new User("ac331","木村");

        map.put("ab123",u1);
        map.put("ab224",u2);
        map.put("ac331",u3);
        System.out.println(u2);
    }
}
