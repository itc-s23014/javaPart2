package chapter7_2;

public class Sample1 {
    public static void main(String[] args) {
        joining j = new joining("",",");
        j.add("apple");
        j.add("banana");
        j.add("peach");
        System.out.println(j.getCsv());

        joining j2 = new joining(",");
        j2.add("apple");
        j2.add("banana");
        j2.add("peach");
        System.out.println(j2.getCsv());

    joining j3 = new joining(",");
        j3.add("apple");
        j3.add("banana");
        j3.add("cherry");
        System.out.println(j3.getCsv());


}
}