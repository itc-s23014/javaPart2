package chapter11_1;

public class add {
    public static void main(String[] args) {
            //ラムダ式
      //  Addable c = (a, b) -> {
        //    return  (a + b);

        //};    省略方
        Addable c =(a,b)->(a+b);
        int s = c.add(10, 20);
        System.out.println(s);
    }
}