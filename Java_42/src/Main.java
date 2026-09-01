public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Husky");
        Cat cat = new Cat("Cam");
        Bird bird = new Bird("Canh cut");

        dog.eat();
        cat.eat();
        bird.eat();

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();

        bird.printName();
    }
}
