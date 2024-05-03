package chapter12_2;

import javax.swing.*;

public class Test1 {
    public static void main(String[] args) {

        //helloという文字列を100回表示する
        //for (int i = 0; i < 100; ++i) {
        //  System.out.println("Hello");
        //  int num = 0;
        //while (num < 100) {
        //  System.out.println("Hello");
        //num +=1;
/*
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 10 ; ++j) {
            System.out.print("q");


                }
            System.out.println();
            }
*/

    /*    for (int i = 1; i <= 10; i++) {
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
*/
                for (int i = 0;i <5; i++){
                    for (int j =0;j <5;j++) {
                        if (i >= j) {
                            System.out.print("+");
                        } else {
                            System.out.print("*");
                        }
                    }
                        System.out.println();
                    }
                }
            }





