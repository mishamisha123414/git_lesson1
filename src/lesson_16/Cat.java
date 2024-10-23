package lesson_16;

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Мяу-мяу!");
    }
}

