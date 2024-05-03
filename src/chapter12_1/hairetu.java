package chapter12_1;

import java.util.ArrayList;
import java.util.List;

public class hairetu {
    public static void main(String[] args) {

        //    String[] name = {"おはよう", "こんにちは", "こんばんは"};
        //   for (String a : name) {
        //     System.out.println(a);
        //}

        // String[] greeting = new String[3];
        // greeting[0] = "ohayou";
        // greeting[1] = "kontnitiha";
        // greeting[2] = "konnbanha";
        // for (int i = 0; i < greeting.length; ++i) {
        //   System.out.println(greeting[i]);


        List<String> greeting = new ArrayList<>();
        greeting.add("おはよう");
        greeting.add("こんにちは");
        greeting.add("こんばんは");

        greeting.forEach(System.out::println);

        //for (String s: greeting){
        //0番目の要素を取得して表示
        System.out.println(greeting.get(0));

        //おはようだったら[yes]と表示
        if (greeting.get(0).contains("おはよう")) {
            System.out.println("yes");


            //good moringと含まれているか
            System.out.println(greeting.contains("good morning"));


            //空でない場合、要素の数を表示する
            if (greeting.isEmpty() == false) {
                System.out.println(greeting.size());


                //greetingsリストの2番目の要素を削除
                System.out.println(greeting.remove(2));
            }

        }
    }
}

    //}

