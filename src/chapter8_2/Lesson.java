package chapter8_2;

public class Lesson {
    private String lessonId;
    private String lessonoName;


    public Lesson(String lessonId, String lessonoName) {
        this.lessonId = lessonId;
        this.lessonoName = lessonoName;
    }
    public int fee() {
        return 1000;
    }

    public String getLessonId() {
        return lessonId;
    }

    public String getLessonoName() {
        return lessonoName;
    }
}
