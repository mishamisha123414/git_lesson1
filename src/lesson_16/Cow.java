package lesson_16;

class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Мууу!");
    }
}
