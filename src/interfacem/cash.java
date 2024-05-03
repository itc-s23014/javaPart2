package interfacem;

import java.util.Scanner;

public class cash implements Paymentmethod,getttengname{

    Scanner ca = new Scanner(System.in);
    @Override
    public void pay() {
        System.out.println("現金を入れてください");
        int cash_cart = ca.nextInt();
    }

    @Override
    public void names() {
        System.out.println("3:現金");
    }
}
