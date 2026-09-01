public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    @Override
    public void eat(){
        System.out.println("Toi an xuong.....");
    }
    @Override
    public void makeSound(){
        System.out.println("Gau gau.....");
    }
}
