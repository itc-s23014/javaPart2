package execise;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("お名前とIDを入力してください");
        //名前とIDを取得する
        String name = sc.nextLine();
        String id = sc.nextLine();


        BankAccount account = new BankAccount(name, id);

        account.menu();

    }
}
class BankAccount{
    //フィールド
    String customerName;    //顧客名
    String customerId;      //顧客ID
    int balance;            //残高

    int prevPrice;

    public BankAccount(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }


    void menu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("お名前: "+customerName +"様(ID:"+customerId+")");
        System.out.println("a) 残高照会");
        System.out.println("b) 預入");
        System.out.println("c) 引出");
        System.out.println("d) 取引履歴");
        System.out.println("e) 終了");

        String option="";

        while (!option.equals("e")){
            System.out.println("操作を選んでください");
            option = sc.nextLine();

            switch (option){
                case "a":

                    System.out.println("残高" + balance + "円");
                    break;

                case "b":

                    System.out.println("預け入れる金額を入力してください");
                    int amount = sc.nextInt();
                    deposit(amount);
                    break;

                case "c":

                    System.out.println("引き出す金額を入力してください");
                    int amountw = sc.nextInt();
                    withdraw(amountw);
                    break;

                case "d":

                    getPrefTrans();
                    break;

                case "e":
                    System.out.println("終了します");
                    break;

                default:
                    System.out.println("入力に誤りがあります");
                    break;
            }
        }



    }

    void deposit(int amount){
        if(amount > 0){
            balance += amount;
        }
    }


    void withdraw(int amount){
        if(amount > 0 && balance >= amount){
            balance -= amount;
        }else {
            System.out.println("金額に誤りがあります。引き出せません。");
        }
    }


    void getPrefTrans(){

    }
}