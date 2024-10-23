package Homework15;

import java.util.ArrayList;

public class ShowContactMenuAction implements MenuActions {

    private final InMemoryContacts inMemoryContacts;

    public ShowContactMenuAction(InMemoryContacts contacts) {
        this.inMemoryContacts = contacts;
    }

    @Override
    public void execute() {
        System.out.println("============");
        ArrayList<Contact> contacts = inMemoryContacts.getAllContacts();
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            System.out.println(i + 1 + " " + contact.getName() + " " + contact.getPhoneNumber());
        }
        System.out.println("============");
    }

    @Override
    public String getName() {
        return "Show contacts";
    }
}
