package execise;

public abstract class Student1 {
    protected int lessonTime; //時間

    protected int lessonCount; //回数

    public int getLessonTime() {
        return lessonTime;
    }
    public  int getLessonCount() {
        return  lessonCount;
    }
    public abstract void  calclessonTime();


    }

