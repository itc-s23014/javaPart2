package chapter12_2;
import java.util.LinkedHashSet;
public class Sample2 {
    public static void main(String[] args) {

        var set = new LinkedHashSet<Meibo>();
        set.add(new Meibo(300,"木村"));
        set.add(new Meibo(100,"田中"));
        set.add(new Meibo(200,"斎藤"));

        set.forEach(System.out::println);
    }
}
