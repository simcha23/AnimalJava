import javax.swing.*;

public class Main {
    public  static void main(String[] args) {

    //First
        System.out.println("First one");
        System.out.println("------------------------");
        Dog dog = new Dog();
        Cat cat = new Cat();


        dog.setName("Rax");
        cat.setName("Stormy");

        dog.eat();
        dog.sound();
        System.out.println("------------------------");
        cat.eat();
        cat.sound();

        System.out.println("\n \n");


    //Second
        System.out.println("Second one");
        Home home = new Home();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        home.makeAllSounds();
        home.adoptPet(dog1);
        home.makeAllSounds();


        home.adoptPet(cat);
        home.makeAllSounds();

        home.adoptPet(dog2);
        home.makeAllSounds();

    }


}
