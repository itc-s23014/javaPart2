package chapter12_2;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            int sam = 0;
            boolean isExit = false;
        while (isExit == false) {
            if (sc.hasNextInt()) {
            int s = sc.nextInt();
            sam = sam + s;
        }else if (sc.hasNextLine());
            String o = sc.nextLine();
            if (o.equals("Enter")) {
                isExit = true;
            }
            System.out.println(sam);



            }
        }


    }

