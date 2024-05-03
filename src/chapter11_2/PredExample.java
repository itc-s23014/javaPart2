package chapter11_2;
import java.beans.PropertyEditorSupport;
import java.util.function.Predicate;

public class PredExample {
    public static void main(String[] args) {

    //    boolean  result = pred(20,(i) -> (i >= 18));
             //   System.out.print(result);
        Predicate<Integer> pr = a ->(a >= 18);
        System.out.println(pr.test(10));
    }
  //  public static  boolean pred(int number,Predicate<Integer> pr){
    //    return pr.test(number);
  //  }
}
