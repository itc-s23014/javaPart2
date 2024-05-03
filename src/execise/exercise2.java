package execise;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.awt.*;
import java.util.Arrays;

public class exercise2 {
    public static void main(String[] args) {

        int num = 10;
        change(num);
       //System.out.println(num);

        int[] nums =  {1,2,3};

        change(nums);
        System.out.println(Arrays.toString(nums));


        String name = "Mike" ;
        change(name);
        System.out.println(name);

        String str = "apple";
        str = "book";


    }
    public static  void change(int n) {
        n = 20;
    }
    public static void  change (int[] n){
        n[0] = 10;
    }
    public static void change(String s) {
        s = "lisa";
    }

}
