package chapter6;

public class Sample2 {
    public static void main(String[] args) {
        Tax tax = new Tax(100,"田中",300000,100000);
        tax.setKoujo(120000);

        System.out.println("控除額=" + tax.getKoujo());


        System.out.println("控除額を上回る所得を設定");
        tax.setKoujo(4000000);
        System.out.println("控除額=" + tax.getKoujo());
        System.out.println("所得額=" + tax.zeigaku());

        System.out.println("控除額を下回る所得額を設定");
        tax.setKoujo(2500000);
        System.out.println("控除額=" + tax.getKoujo());
        System.out.println("所得額=" + tax.zeigaku());
    }
}
