import java.util.Scanner;

public class paiza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sm = new Scanner(System.in);

        int gyou = scanner.nextInt();
        for (int i = 0; i < gyou; ++i) {
            String atai = sm.next();
            if (i < gyou) {
                System.out.println(atai);

            }
        }

    }

}

