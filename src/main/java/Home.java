import java.util.*;
public class Home {

    ArrayList<Animal> animals = new ArrayList<>();
    public  void adoptPet(Animal animal){
        animals.add(animal);
    }
    public  void makeAllSounds(){
        for(Animal a: animals){
            a.sound();

        }
        System.out.println("------------------------");
    }
}
