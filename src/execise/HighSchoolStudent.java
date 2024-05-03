package execise;

public class HighSchoolStudent  extends  Student1 {

    @Override
    public void calclessonTime() {
         lessonTime = lessonCount * 50;

    }

    public HighSchoolStudent(int koma) {
        lessonCount = koma;
    }
}
