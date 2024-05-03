package execise;

import java.util.Random;

public class Sample1 extends Person{
    public static void main(String[] args) {
        dog Dog = new dog();
        animal Animal = Dog;
       // animal.eat();

        dog  d = new dog();
        cat c = new cat();

        Person person = new Person();

       // person.feed(Animal);
       // person.feed(d);


            String[] li = {"犬","猫"};
            Random run = new Random();
            for (int i= 0; i<5; ++i){
                int reand_num = run.nextInt(li.length);
                if (li[reand_num].equals("犬")){
                    dog  inu = new dog();
                    inu.makeSound();

                } else if (li[reand_num].equals("猫")) {
                    cat neko = new cat();
                    neko.makeSound();
                }


                }


            }


        }







