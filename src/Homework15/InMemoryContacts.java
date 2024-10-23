package Homework15;

import java.util.ArrayList;

public class InMemoryContacts {

    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact){
        contacts.add(contact);
    }

    public void removeContact(int index){
        contacts.remove(index);
    }

    public ArrayList<Contact> getAllContacts(){
        return contacts;
    }

    public void showAllContacts(){
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            System.out.println(contact.getName() + " " + contact.getPhoneNumber());
        }
    }

}

