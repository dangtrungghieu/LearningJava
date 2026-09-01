public class Animal {
    protected String name;
    //Constructor get set
    public Animal(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    //Phuong thuc
    public void printName(){
        System.out.println(this.name);
    }
    public void eat(){
        System.out.println("Eating....");
    }
    public void makeSound(){
        System.out.println("Making Sound...");
    }
    public void sleep(){
        System.out.println("Sleeping....");
    }
}
