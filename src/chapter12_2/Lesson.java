package chapter12_2;

import java.util.HashSet;

public class Lesson {
    public static void main(String[] args) {

        var set = new HashSet<String>();
        set.add("山田");
        set.add("田中");
        set.add("池田");
        //何件の要素があるか表示
        System.out.println(set.size());

        //セットの中身が空かどうか表示する
        System.out.println(set.isEmpty());

        //池田を消去する
        set.remove("池田");

        //セットの中身表示
        set.forEach(System.out::println);

        }
    }

