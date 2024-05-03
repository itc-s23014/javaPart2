package chapter12_2;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class test4 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 3 != 0) {
                count += 1;

            }
        }
        System.out.println(count);
    }
}