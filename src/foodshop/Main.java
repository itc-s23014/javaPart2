package foodshop;

import java.util.List;
import java.util.Scanner;

public class Main extends piza {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        Scanner yn = new Scanner(System.in);

        boolean oderflag = false;
        System.out.println("WELCOME TO MY PIZZA STORE!!");
        piza[] pizza = new piza[4];
        pizza[0] = new malgerita();
        pizza[1] = new marinala();
        pizza[2] = new peparoni();
        pizza[3] = new palm();
        Cart cart = new Cart();
        int total_price = 0;

        for (piza p : pizza) {
            System.out.println("商品id:"+ p.id +"商品名:" + p.name + "価格" + p.price +"円");
        }
        while (!oderflag) {
            System.out.println("ご希望のピザの商品idを入力してください");

            int input_id = id.nextInt() - 1;
            if (input_id > 5){
                System.out.println("承れません");
                continue;
            }


            cart.piza_add(pizza[input_id]);
            cart.input_total(pizza[input_id].price);


            List<piza> pizzaArrayList = cart.getPizzaList();
            for (piza p : pizzaArrayList) {
                System.out.println("商品id:" + p.id + "商品名:" + p.name + "価格:" + p.price);
            }

            System.out.println("支払いに進みますか?(y:はい　n:いいえ)");
            String input_henzi = yn.next();
            if (input_henzi.equals("y")) {
                oderflag = true;

            }
        }
        total_price = cart.getTotal();
        System.out.println("合計金額:" + total_price + "円");

                List<piza> pizzaArryList = cart.getPizzaList();
                for (piza a: pizzaArryList) {
                    a.genjou();

                }
                System.out.println("ご利用ありがとうございました！！");

    }
        }


