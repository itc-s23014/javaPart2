package execise;

import java.time.LocalDate;
import java.util.List;

public class E83_1 {
    public static void main(String[] args) {

        List<Member> list = List.of(
                new GeneralMember(200,"村田"),
                new StudentMember(100,"田中",
                LocalDate.of(2050,3,31)),
                new seniorMember(150,"鈴木",
                LocalDate.of(1960,3,31))

        );
        int total = 0;
        for (Member m : list) {
            total += m.fee();
        }
        System.out.println("合計=" + total);
    }
}
