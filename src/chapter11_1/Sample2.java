package chapter11_1;

public class Sample2 {
    public static void main(String[] args) {
        // Sample1 sample1 = new Sample1();
        //   sample1.draw();
        //匿名クラス
        // Drawable d = new Drawable() {
        //@Override
        // public void draw() {
        //System.out.println("hello");
        //ラムダ式クラス
        Drawable d = () -> {
            System.out.println("Hello");
        };

        d.draw();
    }
}