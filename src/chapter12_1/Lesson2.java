package chapter12_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lesson2 {
    public static void main(String[] args) {

        //映画のタイトルを入れたリストを作る
        //（前回のgreetingsリストの作り方参考）
        //forEachメソッドを使い、全要素を表示させる
        List<String> movie = new ArrayList<>();
        movie.add("ゴジラ");
        movie.add("怪物の木こり");
        movie.add("飛んで埼玉");

        movie.sort(Comparator.naturalOrder());

        movie.forEach(System.out::println);



    }
}
