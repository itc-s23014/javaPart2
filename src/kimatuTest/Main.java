package kimatuTest;

import java.util.List;                                  //言い訳ですが時間が足りなくて色々無理やり感ありますが、一応計算問題です。
                                                        //敵が出てきて問題にクリアしたらマリオが攻撃します。
                                                        //6回問題に正解したら敵を撃破できるというゲームです
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                //ここでscはスタート、srはプレイヤーのための標準入力
        Scanner sr = new Scanner(System.in);
        boolean a = false;                                  //a == falseにしといてfalseの間問題を出しつづける
        mario m = new mario();
        Random ran = new Random();                          //ランダムに数値をとってきて敵を選ぶ
        String[] teki = {"テレサ", "クッパ", "ノコノコ"};
        int tekisan = ran.nextInt(teki.length);
        int count = 3 ;                                      //count にしてcont == 0 になったらゲームオーバーにした


        System.out.println("マリオと一緒に冒険ゲーム");
        System.out.println();
        System.out.println("ルール説明");
        System.out.println("出てくる敵を倒そう");
        System.out.println("その敵を倒すには問題を解いてね！");
        System.out.println("問題に正解するとマリオが攻撃してくれるよ");
        System.out.println("ゲージが0になるとゲームオーバーだから気をつけてね");
        System.out.println("Enterでスタートします");
        String anykey = sc.nextLine();
        System.out.println("------------------------------");

        if (anykey.equals("")) {                        //ifでスタートした時敵を出すようにした
            String Teki = teki[tekisan];
            System.out.println(Teki+"が現れた!!");
            System.out.println("問題を解いて倒そう！！");

            while (!a && count > 0) {
                Random rnd = new Random();                          //ランダムな数値をfigure1とfigure2の変数に入れて問題を作って
                int figure1 = rnd.nextInt(500) +1;
                int figure2 = rnd.nextInt(500) +1;
                int kotae = figure1 + figure2;
                System.out.println("現在のゲージ"+count);
                System.out.println(figure1 + "+" + figure2 + "= ?");

                int Player = sr.nextInt();
                if (kotae == Player) {                                      //正解かどうか判定するif文を書いて
                    System.out.println("正解");
                    m.attack();
                    count++;                                                //正解したらcount++して
                if (count > 6){
                    m.Deathblow();                                          //ここでもし３回正解できたら敵を倒せるようにした。
                    System.out.println(Teki + "が倒れた！！");
                    System.out.println("あなたの勝利です！");
                    a = true;
                }
                } else {
                    System.out.println("不正解");                          //正解の逆バージョン
                    System.out.println(Teki+"に攻撃された");
                    count--;
                }  if (count <=0) {                                         //ゲームオーバーの場合
                    System.out.println("ゲージ"+count);
                    System.out.println("ゲームオーバー");
                    System.out.println(Teki+"に倒されました");
                }
            }

        }
    }
}