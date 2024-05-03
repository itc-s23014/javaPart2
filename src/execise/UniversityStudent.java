package execise;

public class UniversityStudent extends Student1 implements Work {
    protected int worktime;
    protected int income;

    @Override
    public void calclessonTime() {
        lessonTime = lessonCount * 90;

    }

    public UniversityStudent(int koma, int time) {
        lessonCount = koma;
        worktime = time;
    }

    public int ByteMoney() {
          return  income = worktime * 1100;
    }
    public int getIncome() {
        return income;
    }
}

