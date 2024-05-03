import java.util.Random;
import java.util.Scanner;

public class games {                                        //シークレット枠を追加しました。
                                                                //NIKUがシークレット問題として、もしシークレット問題に正解した場合、通常問題と受け答えが変わる
    public static void main(String[] args) {

        String[] kotae = {"JAVA", "BOOK", "BLUE","NIKU"};  //  //答えに肉を追加
        Random r = new Random();
        int reand_num = r.nextInt(kotae.length);
        String answer = kotae[reand_num];
        if (answer.equals("NIKU")){                             //ここでanswerに入ってくる値が肉だったらシークレット問題と表示する
            System.out.println("シークレット問題！:俺の好きな食べ物は？？");
        }
        char[] answerChars = answer.toCharArray();
        char[] playerChars = new char[answerChars.length];


        for (int a = 0; a < playerChars.length; ++a) {
            playerChars[a] = '_';
        }

        int count = 5;
        boolean completed = false;

        Scanner scanner = new Scanner(System.in);

        while (!completed &&  count > 0) {
            System.out.println("現在の状況");
            printArray(playerChars);

            System.out.println("残りの回数: " + count);
            System.out.println("一文字目を入力してください");

            String inputStr = scanner.nextLine().toUpperCase();
            char input = inputStr.charAt(0);

            boolean found = false;
            for (int b = 0; b < answerChars.length; ++b) {
                if (answerChars[b] == input) {
                    playerChars[b] = input;
                    found = true;
                }
            }

            if (!found) {
                count--;
            }
            if ((isComplete(playerChars)) && answer.equals("NIKU")) {       //ここでシークレット問題に正解した場合のみ受け答えが変わるように作った
                System.out.println("大正解！俺のことわかってんね〜");
                completed = true;
            }
            else if ((isComplete(playerChars))) {
                System.out.println("正解");
                completed = true;
            }



        }

        if (!completed){
            System.out.println("ゲームオーバー");
        }





        scanner.close();
    }

    public static boolean isComplete(char[] array) {
        for (char c : array) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }

    public static void printArray(char[] array) {
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}












