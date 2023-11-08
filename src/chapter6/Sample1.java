package chapter6;

public class Sample1 {
    public static void main(String[] args) {
        Tax tax = new Tax(100, "田中", 300_000 , 100_000);

        System.out.println("納税者番号=" + tax.getNumber());
        System.out.println("氏　名=" + tax.getName());
        System.out.println("納税者番号=" + tax.getShotoku());
        System.out.println("納税者番号=" + tax.getKoujo());



        System.out.println(tax.zeigaku());
    }
}
