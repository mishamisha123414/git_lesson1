package lesson_7;

class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String greens;
    private String mayo;

    // Це я зробив для звичайного бургера
    public Burger(String bun, String meat, String cheese, String greens, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
        System.out.println("Звичайний бургер: булочка = " + bun + ", м'ясо = " + meat + ", сир = " + cheese + ", зелень = " + greens + ", майонез = " + mayo);
    }

    // Це я зробив для дієтичного бургера (без майонезу)
    public Burger(String bun, String meat, String cheese, String greens) {
        this(bun, meat, cheese, greens, "без майонезу");
        System.out.println("Дієтичний бургер: булочка = " + bun + ", м'ясо = " + meat + ", сир = " + cheese + ", зелень = " + greens + ", без майонезу");
    }

    // Це я зробив для бургера з подвійним м'ясом
    public Burger(String bun, String meat, String cheese, String greens, String mayo, boolean doubleMeat) {
        this.bun = bun;
        this.meat = doubleMeat ? meat + " (подвійна порція)" : meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
        System.out.println("Бургер з подвійним м'ясом: булочка = " + bun + ", м'ясо = " + this.meat + ", сир = " + cheese + ", зелень = " + greens + ", майонез = " + mayo);
    }
}

 class BurgerMain {
    public static void main(String[] args) {
        Burger regularBurger = new Burger("булочка", "Яловичина", "Сир", "Салат", "Майонез");
        Burger dietBurger = new Burger("Житня булочка", "Курятина", "Моцарелла", "Зелень");
        Burger doubleMeatBurger = new Burger("Солодка булочка", "Свинина", "Сир", "Салат", "Майонез", true);
    }
}

