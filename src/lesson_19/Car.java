package lesson_19;

public class Car {
    private String model;
    private int year;
    private Engine engine;
    private Wheel wheel;

    public Car(String model, int year, int wheelSize) {
        this.model = model;
        this.year = year;
        this.engine = new Engine();
        this.wheel = new Wheel(wheelSize);
    }

    public void showInfo() {
        System.out.println("Модель: " + model + ", Рік випуску: " + year);
    }

    public void engineStart() {
        engine.start();
    }

    public void engineStop() {
        engine.stop();
    }

    public int getWheelSize() {
        return wheel.getSize();
    }

    private class Engine {
        private boolean isRunning;

        public Engine() {
            this.isRunning = false;
        }
        public void start() {
            if (!isRunning) {
                isRunning = true;
                System.out.println("Двигун запущено.");
            } else {
                System.out.println("Двигун вже працює.");
            }
        }
        public void stop() {
            if (isRunning) {
                isRunning = false;
                System.out.println("Двигун зупинено.");
            } else {
                System.out.println("Двигун вже зупинений.");
            }
        }
    }
    public static class Wheel {
        private int size;

        public Wheel(int size) {
            this.size = size;
            System.out.println("Розмір колес: " + size + " дюймів.");
        }

        public int getSize() {
            return size;
        }
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", 2020, 16);

        car.showInfo();

        car.engineStart();
        car.engineStop();

        System.out.println("Розмір коліс: " + car.getWheelSize() + " дюймів.");
    }
}

