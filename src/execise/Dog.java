package execise;

import java.awt.*;

public class Dog {

    int size;

    String name;


    public void tekitou() {
        if ( size== 1 ){
            System.out.println(name + "はワンと吠えた");

            }
        else {
            if (size ==2 ){
                System.out.println(name +"はワーンと吠えた");

            }
            else {

                   System.out.println(name +"ワンワンと吠えた");
                }
            }

        }

    public static void main(String[] args) {
        Dog dog = new Dog();
            dog.size=1;
            dog.name="tiwawa";
            //dog.tekitou();

            Dog dog1 = new Dog();
            dog1.size=2;
            dog1.name="burudog";
            //dog1.tekitou();

            Dog dog2 = new Dog();
            dog2.size=3;
            dog2.name="sibainu";
            //dog2.tekitou();




        Dog[] dog3= new Dog[3];
        dog3[0] = dog;
        dog3[1] = dog1;
        dog3[2] = dog2;

        for (Dog dog4: dog3){
            dog4.tekitou();
        }




    }


    }







