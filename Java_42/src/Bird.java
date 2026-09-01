public class Bird extends Animal {
    public Bird(String name){
        super(name);
    }

    @Override
    public void eat(){
        System.out.println("Toi an sau.....");
    }

    @Override
    public void makeSound(){
        System.out.println("Liu lo.....");
    }
}
