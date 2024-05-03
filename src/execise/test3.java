package execise;

import java.util.Scanner;
import java.util.Stack;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suuzi = scanner.nextInt();

        int num = Tesk(suuzi);
        System.out.println(num);


        Integer i1 = Integer.valueOf(10);
        System.out.println(i1.compareTo(num));

        String b  = String.valueOf(10);


    }

    public static int Tesk(int num) {
        if (num > 10) {
            return -1;
        } else if (num < 10) {
            return +1;

        } else {
            return 0;
        }
    }
}


