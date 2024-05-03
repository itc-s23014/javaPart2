package chapter12_2;
import java.util.HashSet;
public class Sample1 {
    public static void main(String[] args) {

        var set = new HashSet<Meibo>();
        set.add(new Meibo(100,"田中"));
        set.add(new Meibo(200,"木村"));
        set.add(new Meibo(100,"田中"));
        set.add(new Meibo(300,"斎藤"));

        set.forEach(System.out::println);
    }
}
