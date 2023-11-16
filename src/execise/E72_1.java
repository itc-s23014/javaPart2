package execise;
import chapter7_2.joining;
public class E72_1 {
    public static void main(String[] args) {
        joining j1 = new joining("-");
        j1.add("apple");
        j1.add("banana");
        j1.add("peach");
        System.out.println(j1.getCsv());
    }
}
