package lesson_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactBook {
    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Контакт додано успішно!");
    }

    public void removeContact(String name) {
        Contact contactToRemove = findContactByName(name);
        if (contactToRemove != null) {
            contacts.remove(contactToRemove);
            System.out.println("Контакт видалено успішно!");
        } else {
            System.out.println("Контакт не знайдено.");
        }
    }

    public Contact findContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Контакти відсутні.");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }
}

