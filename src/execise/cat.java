package execise;

public class cat extends animal{



    public static void eat(){
        System.out.println("猫が餌を食べる");
}

    @Override
    public void makeSound() {
        System.out.println("ニャー");
    }
}
