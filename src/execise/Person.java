package execise;

public class Person extends dog {
    public void feed(animal Animal) {


       Animal.eat();

       if (Animal instanceof dog){
           dog Dog = (dog)Animal;
           dog.work();
       }



    }



    }

