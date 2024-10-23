package Homework15;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ChangePhoneNumber {

    private List<Contact> inMemoryContacts;
    private Scanner scanner;

    public ChangePhoneNumber(List<Contact> inMemoryContacts, Scanner scanner) {
        this.inMemoryContacts = inMemoryContacts;
        this.scanner = scanner;
    }
    public void execute() {
        System.out.println("Введіть ім'я контакту, номер якого хочете змінити:");
        String contactName = scanner.nextLine();

        Contact contact = findContactByName(contactName);

        if (contact != null) {
            System.out.println("Контакт знайдено: " + contact.getName());
            System.out.println("Введіть новий номер телефону:");
            String newPhoneNumber = scanner.nextLine();

            if (isValidPhoneNumber(newPhoneNumber)) {
                contact.setPhoneNumber(newPhoneNumber);
                System.out.println("Номер телефону змінено успішно.");
            } else {
                System.out.println("Невірний формат номера телефону. Спробуйте ще раз.");
            }
        } else {
            System.out.println("Контакт з ім'ям " + contactName + " не знайдено.");
        }
    }

    private Contact findContactByName(String name) {
        for (Contact contact : inMemoryContacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        String phoneRegex = "\\+380\\d{9}";
        Pattern pattern = Pattern.compile(phoneRegex);
        return pattern.matcher(phoneNumber).matches();
    }
}

