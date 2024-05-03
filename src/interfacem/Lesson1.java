package interfacem;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner pay = new Scanner(System.in);
        Paymentmethod[] otptions = new Paymentmethod[3];
        otptions[0] = new card();
        otptions[1] = new Electronicmoney();
        otptions[2] = new cash();
        System.out.println("お支払い方法を選んでください");
        for (int i =0;otptions.length >i; ++i){

        }
        




        int Payment = pay.nextInt();
        PaymentProcessor hantei = new PaymentProcessor();
        hantei.Payment(Payment);

        }

    }

    class PaymentProcessor {


        public void Payment(int Payment){
            if (Payment ==1){
                Paymentmethod card = new card();
                card.pay();
            }else if (Payment == 2){
                Paymentmethod Elsectronic = new Electronicmoney();
                Elsectronic.pay();
            } else if (Payment == 3) {
                Paymentmethod cash = new cash();
                cash.pay();
        }

        {

        }
    }
}