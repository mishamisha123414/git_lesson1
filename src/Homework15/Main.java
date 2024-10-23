package Homework15;

import java.util.List;
import java.util.Scanner;

public class Main {

    //Book lesson15.storage.Contact
    //0. Cтворити контакти
    //1. Зберігати контакти
    //2. Додавати контакти
    //3. Видаляти контакти
    //4. Редагувати контакти
    //5. Виводити всі контакти на екран
    //6. Меню яку дозволяє все це робити

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InMemoryContacts inMemoryContacts = new InMemoryContacts();
        Contact john = new Contact("John","+38(095)123-34-35");
        Contact barry = new Contact("Barry","+38(067)321-43-76");
        inMemoryContacts.addContact(john);
        inMemoryContacts.addContact(barry);
        Menu menu = new Menu(scanner);
        menu.addMenuAction(new AddContactMenuAction(inMemoryContacts,scanner));
        menu.addMenuAction(new RemoveContactMenuAction(inMemoryContacts,scanner));
        menu.addMenuAction(new ShowContactMenuAction(inMemoryContacts));
        menu.addMenuAction((MenuActions) new ChangePhoneNumber((List<Contact>) inMemoryContacts,scanner));
        menu.addMenuAction(new ExitMenuAction());
        menu.run();

    }

}