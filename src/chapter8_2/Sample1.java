package chapter8_2;

public class Sample1 {
    public static void main(String[] args) {

        var lesson = new Lesson("G101", "ゴルフ");
        var gm = new GeneralMember(100, "田中",lesson);


        System.out.println("会員氏名=" + gm.getName());
        System.out.println("受講しているレッスン=" + gm.getLessonoName());
        System.out.println("レッスン料金=" + gm.fee());
     //   System.out.println(gm.getLession.getLessonName());
    }
}