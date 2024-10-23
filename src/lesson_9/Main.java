package lesson_9;

enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}

class CalendarApp {

    public boolean isWeekend(DayOfWeek day) {
        return day.isWeekend();
    }

    public static void main(String[] args) {
        CalendarApp app = new CalendarApp();
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day + " is " + (app.isWeekend(day) ? "Weekend" : "Weekday"));
        }
    }
}

class Person {
    private String name;
    private int age;
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be positive.");
        }
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null || city.isEmpty()) {
            throw new IllegalArgumentException("City cannot be empty.");
        }
        this.city = city;
    }

    public String introduceYourself() {
        return "Привет, меня зовут " + getName() + ", мне " + getAge() + " лет, я живу в городе " + getCity() + ".";
    }
}

class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Иван");
        person.setAge(34);
        person.setCity("Киев");

        System.out.println("Имя: " + person.getName());
        System.out.println("Возраст: " + person.getAge());
        System.out.println("Город: " + person.getCity());

        System.out.println(person.introduceYourself());
    }
}

