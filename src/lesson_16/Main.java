package lesson_16;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog("Собака");
        Animal cat = new Cat("Кішка");
        Animal cow = new Cow("Корова");

        dog.eat();
        dog.makeSound();

        cat.eat();
        cat.makeSound();

        cow.eat();
        cow.makeSound();
    }
}
