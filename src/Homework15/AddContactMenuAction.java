package Homework15;

import java.util.Scanner;

public class AddContactMenuAction implements  MenuActions {

    private final Scanner scanner;
    private final InMemoryContacts contacts;
    private final int UKRAINIAN_PHONE_NUMBER_LENGTH = 17;

    public AddContactMenuAction(InMemoryContacts contacts, Scanner scanner){
        this.contacts = contacts;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.println("Введіть ім´я контакту");
        String name = scanner.nextLine();
        System.out.println("Введіть номер телефону в форматі +380(**)***-**-**");
        String phone = scanner.nextLine();
        if(isCorrectPhoneNumber(phone)){
            Contact contact = new Contact(name,phone);
            contacts.addContact(contact);
        } else {
            System.out.println("Ви ввели невірний формат номеру телефону");
            System.out.println("Будь ласка зберігайте формат +380(**)***-**-**");
            execute();
        };
    }

    private boolean isCorrectPhoneNumber(String phone){
        if (phone.length() != UKRAINIAN_PHONE_NUMBER_LENGTH) return false;
        if (!phone.contains("+") || !phone.contains("(") || !phone.contains(")") || !phone.contains("-")) return false;
        if (!phone.startsWith("+380(")) return false;
        return true;
    }


    @Override
    public String getName() {
        return "Add contact";
    }
}
