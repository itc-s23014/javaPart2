import java.util.InputMismatchException;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);

        String nyuuryoku =sr.next();
        day s = day.valueOf(nyuuryoku.toUpperCase());
        switch (s){
            case MONDAY -> System.out.println("月曜日は憂鬱だ");
            case FRIDAY -> System.out.println("金曜日は嬉しい");
            case SUNDAY,SATURDAY -> System.out.println("土日は楽しい");
            default -> System.out.println("普通");
        }

    }
}
enum day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,SUNDAY,


}