package chapter9_1;

import java.time.LocalDate;

public class Sample3 {
    public static void main(String[] args) {

        Member m1= new StudentMember(200,"木村", LocalDate.of(2026,3,31));
        //Member m1 = new SeniorMember(150,"鈴木",LocalDate.of(1960,3,31));

        StudentMember sm = (StudentMember) m1;
        System.out.println("期限切れ=" + sm.isExpired());

        if (m1 instanceof StudentMember) {
            StudentMember stm = (StudentMember) m1;
            System.out.println("期限日=" + sm.getExpDate());
        }
        if (m1 instanceof StudentMember s2) {
            System.out.println("期限切れ= " + s2.getExpDate());
        }
        //追加の検証
        Object o = new GeneralMember(200," 木村");

        if (o instanceof Member m2) {
            System.out.println("名前=" + m2.getName());
        }
    }
}
