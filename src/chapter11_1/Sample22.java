package chapter11_1;

import chapter10_2.Tax;

public class Sample22 {
    public static void main(String[] args) {



            chapter10_2.Tax tax = new Tax(100,"田中",150);
            int zei = tax.zeigaku(gaku -> gaku>80 ? 0.12:0.04);
            System.out.println(tax.getName() + "¥t" + zei);
        }
    }


