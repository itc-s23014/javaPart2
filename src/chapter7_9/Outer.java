package chapter7_9;

public class Outer {
    private int number;
    public Outer(int number) {
        this.number = number;

        }
       public void print() {
            Ineer inner = new Ineer();
            System.out.println(inner.msg());

    }
    private class Ineer {
            public String msg() {
                return "number is " + number;
            }
    }
}
