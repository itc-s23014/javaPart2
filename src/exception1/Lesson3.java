package exception1;

public class Lesson3 {
    public static void main(String[] args) {


    }
        static  void generateNumber() throws Exception {
            int number = (int)(Math.random()*100);
            if(number == 13) {
                throw new Exception("アンラッキー");
            }
        }
}
