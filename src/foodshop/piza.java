package foodshop;

import com.sun.jdi.request.InvalidRequestStateException;

public abstract class piza {

        String name;

        int id;
        int price;

        public void genjou() {
                System.out.println(name+"を作っています");
                System.out.println();
                System.out.println(name+"をカットしています");
                System.out.println();
                System.out.println(name+"箱に入れています");
                System.out.println();
                System.out.println("出来上がりました");


        }



}
