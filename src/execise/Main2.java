package execise;

public class Main2 {


    public Main2(int koma) {

    }

    public static void main(String[] args) {


       // HighSchoolStudent highschool = new HighSchoolStudent(0);
       // UniversityStudent university = new UniversityStudent(1,2);

        Student1[] student1s = new Student1[2];
        student1s[0] = new HighSchoolStudent(5);
        student1s[1] = new UniversityStudent(3,4);

        for (Student1 s : student1s) {
            s.calclessonTime();

            if (s instanceof HighSchoolStudent){
                System.out.print("高校生:");
                System.out.println(s.lessonTime / 60 + "時間" + s.getLessonTime() % 60 + "分");
            }
            if (s instanceof UniversityStudent){
                System.out.print("大学生:");
                System.out.println(s.lessonTime / 60 + "時間" + s.getLessonTime() % 60 + "分");
                ((UniversityStudent) s).getIncome();
                System.out.println("給料"+((UniversityStudent) s).ByteMoney()+"円");
            }

        }
    }
}