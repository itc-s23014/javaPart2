package execise;

import chapter6.Tax;

public class E62_1 {
    public static void main(String[] args) {
        Tax kimura = new Tax(110,"木村",300_000,900_00);
        Tax suzuki = new Tax(120,"鈴木",250_000,1200_00);
        Tax saitou = new Tax(130,"斎藤",400_000,1800_00);

        System.out.println(kimura.zeigaku());
        System.out.println(suzuki.zeigaku());
        System.out.println(saitou.zeigaku());
        }
    }

