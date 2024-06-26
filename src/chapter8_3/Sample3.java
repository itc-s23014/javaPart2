package chapter8_3;


import chapter8_1.GeneralMember;

import java.time.LocalDate;
import java.util.List;

public class Sample3 {
    public static void main(String[] args) {

        List<GeneralMember> list = List.of(
                new GeneralMember(200,"木村"),
                new StudentMember(100,"田中",LocalDate.of(2026,3,31)),
                new StudentMember(150,"鈴木", LocalDate.of(1960,3,31))
        );
        int total = 0;
        for(GeneralMember gem : list) {
            total += gem.membershipFee();
        }
        System.out.println("合計=" + total);
    }
}
