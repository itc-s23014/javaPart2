package chapter6;

public class Sample4 {
    public static void main(String[] args) {

        Tax t1 = new Tax(100, "田中", 300_000, 100_000);
        Tax t2 = new Tax(100, "田中あ",280_000, 120_000);

        if (t1.equals(t2)) {
            System.out.println("等しい");
        }

        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());

    }
}