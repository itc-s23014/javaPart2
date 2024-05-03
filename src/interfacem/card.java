package interfacem;

import java.util.Scanner;

public class card implements Paymentmethod,getttengname{

        Scanner sr = new Scanner(System.in);

    @Override
    public void pay() {
        System.out.println("クレジットカード番号を入力してください");
        int bangou = sr.nextInt();

    }

    @Override
    public void names() {
        System.out.println("1:クレジットカード");
    }
}
