package chapter12_2;

public class nwonow {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i == 1 || i == 10) {
                    System.out.print("B");
                } else if (j == 1 || j == 20) {
                    System.out.print("B");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
