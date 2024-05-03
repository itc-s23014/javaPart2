package exception1;

public class Lesson5 {
    public static void main(String[] args) {
        try {
            checkAge(19);
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
    static void checkAge(int age) {
        if (age < 18){
            throw new ArithmeticException("アクセスは拒否されました");
        }else {
            System.out.println("認知されました");
        }
    }
}
