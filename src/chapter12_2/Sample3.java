package chapter12_2;

import com.sun.source.tree.Tree;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sample3 {
    public static void main(String[] args) {

        var set = new TreeSet<Meibo>();
        set.add(new Meibo(300,"木村"));
        set.add(new Meibo(100,"田中"));
        set.add(new Meibo(200,"斎藤"));

        set.forEach(System.out::println);
    }
}
