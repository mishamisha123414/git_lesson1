package lesson_8;

import java.util.Objects;

public class Car {
    private String color;
    private int wheels;
    private String brand;
    private double engineVolume;

    public Car(String color, int wheels, String brand, double engineVolume) {
        this.color = color;
        this.wheels = wheels;
        this.brand = brand;
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getWheels() {
        return wheels;
    }

    public String getBrand() {
        return brand;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return wheels == car.wheels &&
                Double.compare(car.engineVolume, engineVolume) == 0 &&
                Objects.equals(color, car.color) &&
                Objects.equals(brand, car.brand);
    }
    @Override
    public int hashCode() {
        return Objects.hash(color, wheels, brand, engineVolume);
    }

    public static void main(String[] args) {

        Car car1 = new Car("Red", 4, "Toyota", 2.0);
        Car car2 = new Car("Red", 4, "Toyota", 2.0);
        Car car3 = new Car("Blue", 4, "Ford", 3.5);

        System.out.println("car1 equals car2: " + car1.equals(car2));
        System.out.println("car1 equals car3: " + car1.equals(car3));
    }
}

