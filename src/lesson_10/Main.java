package lesson_10;

interface Smartphones {
    void call(String number);
    void sms(String number, String message);
    void internet();
}


interface LinuxOS {
    void linuxFeature();
}


interface iOS {
    void iosFeature();
}

class Androids implements Smartphones, LinuxOS {
    @Override
    public void call(String number) {
        System.out.println("Android calling to " + number);
    }

    @Override
    public void sms(String number, String message) {
        System.out.println("Android sending SMS to " + number + ": " + message);
    }

    @Override
    public void internet() {
        System.out.println("Android accessing the internet");
    }

    @Override
    public void linuxFeature() {
        System.out.println("Android using a Linux-specific feature");
    }
}

class iPhones implements Smartphones, iOS {
    @Override
    public void call(String number) {
        System.out.println("iPhone calling to " + number);
    }

    @Override
    public void sms(String number, String message) {
        System.out.println("iPhone sending SMS to " + number + ": " + message);
    }

    @Override
    public void internet() {
        System.out.println("iPhone accessing the internet");
    }

    @Override
    public void iosFeature() {
        System.out.println("iPhone using an iOS-specific feature");
    }
}

public class Main {
    public static void main(String[] args) {
        Smartphones androidPhone = new Androids();
        Smartphones iPhone = new iPhones();

        androidPhone.call("123-456-789");
        androidPhone.sms("123-456-789", "Hello!");
        androidPhone.internet();

        iPhone.call("987-654-321");
        iPhone.sms("987-654-321", "Hello!");
        iPhone.internet();
    }
}

