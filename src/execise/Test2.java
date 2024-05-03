package execise;

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("一番目の値を入力してください:");
        int x = sc.nextInt();

        Scanner rc = new Scanner(System.in);
        System.out.println("二番目の値を入力してください:");
        int y = rc.nextInt();

        Scanner ac = new Scanner(System.in);
        System.out.println("三番目の値を入力してください:");
        int a = ac.nextInt();

        int m = smallest(x,y,a);
        System.out.println("一番小さい値は"+m +"です");

    }

    public static int smallest(int t ,int k , int e){

        int r =Math.min(Math.min(t, k), e);
        return  r;
    }

}
