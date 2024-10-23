package Homework15;

import java.util.Scanner;

public class RemoveContactMenuAction implements MenuActions {

    private InMemoryContacts contacts;
    private Scanner scanner;

    public RemoveContactMenuAction(InMemoryContacts contacts, Scanner scanner) {
        this.contacts = contacts;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.println("Виберіть контакт який хочете видалити за індексом");
        int index = scanner.nextInt();
        scanner.nextLine();
        contacts.removeContact(index - 1);
        System.out.println("Контакт був успішно видалений");
    }

    @Override
    public String getName() {
        return "Remove contact";
    }
}
