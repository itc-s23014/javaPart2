package exception1;

import java.util.List;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        boolean  r = false;
        List<String> students = List.of("Mike","Lisa","John");
        try {
            while (!r) {
                System.out.println("生徒の番号を入力してください(0 〜　2)");
                String exit = sr.nextLine();
                if (sr.equals("exit")) {
                    r = true;
                    break;
                }
                 int bangou = Integer.parseInt(exit);

                System.out.println(students.get(bangou));
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("いません");
        }catch (NumberFormatException e) {
            System.out.println("値が不正です");
        }




    }
}
