package execise;

public class dog extends animal {

    public static void eat(){
        System.out.println("犬が餌を食べる");
    }
    public static void work(){
        System.out.println("犬が散歩をする");
    }

    @Override
    public void makeSound() {
        System.out.println("わんわん");
    }
}
