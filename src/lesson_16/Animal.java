package lesson_16;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // Обычный метод eat()
    public void eat() {
        System.out.println(name + " їсть.");
    }

    // Абстрактный метод makeSound()
    public abstract void makeSound();
}
