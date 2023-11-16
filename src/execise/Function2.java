package execise;

public class Function2 {

    private int a;
    private int b;

    public Function2(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public Function2(int b) {
        this(10,b);
    }

    public Function2() {
        this(10,5);
    }

    public void result() {
        System.out.println(a + "x+"+b);
    }

    public static void main(String[] args) {
        Function f2 = new Function(12,3);
        f2.result();
    }
}




