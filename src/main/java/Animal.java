public class Animal {
    private String name;

    public void setName(String name){
        this.name = name;
    }
    public  void eat(){
        System.out.println( name + " is eating");
    }

    public  void sound(){

        System.out.println("Dog is barking");
        System.out.println("Cat is meows");
    }
}
