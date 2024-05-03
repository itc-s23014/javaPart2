package chapter11_1;

public class sayHello {
    public static void main(String[] args) {

        Greeting g = (name) -> {
            return "hello," + name;

        };
        String s = g.sayHello("maiku");
        System.out.println(s);


        }
    }

