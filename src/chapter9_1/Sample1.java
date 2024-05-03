package chapter9_1;

import java.time.LocalDate;
import java.util.List;

public class Sample1 {
    public static void main(String[] args) {
        List<Member> list = List.of(
                new GeneralMember(200,"木村"),
                new StudentMember(100,"田中",LocalDate.of(2026,3,31)),
                new SeniorMember(150,"鈴木",LocalDate.of(1960,3,31))
        );

        int total = 0;
        for(Member member : list) {
            total += member.fee();
        }
        System.out.println("合計=" + total);
    }
}
