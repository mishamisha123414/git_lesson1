package lesson_14;

import java.util.Scanner;

//В мейні я зробив інші дії :
//System.out.println("\nВиберіть дію:");
//            System.out.println("1 - Додати контакт");
//            System.out.println("2 - Видалити контакт");
//            System.out.println("3 - Пошук контакту");
//            System.out.println("4 - Показати всі контакти");
//            System.out.println("5 - Вийти");
//Використовуючи while та switch та case
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactBook contactBook = new ContactBook();
        boolean running = true;

        while (running) {
            System.out.println("\nВиберіть дію:");
            System.out.println("1 - Додати контакт");
            System.out.println("2 - Видалити контакт");
            System.out.println("3 - Пошук контакту");
            System.out.println("4 - Показати всі контакти");
            System.out.println("5 - Вийти");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Введіть ім'я: ");
                    String name = scanner.nextLine();
                    System.out.print("Введіть номер телефону: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Введіть email: ");
                    String email = scanner.nextLine();

                    contactBook.addContact(new Contact(name, phoneNumber, email));
                    break;

                case "2":
                    System.out.print("Введіть ім'я контакту для видалення: ");
                    String nameToRemove = scanner.nextLine();
                    contactBook.removeContact(nameToRemove);
                    break;

                case "3":
                    System.out.print("Введіть ім'я для пошуку: ");
                    String nameToFind = scanner.nextLine();
                    Contact foundContact = contactBook.findContactByName(nameToFind);
                    if (foundContact != null) {
                        System.out.println(foundContact);
                    } else {
                        System.out.println("Контакт не знайдено.");
                    }
                    break;

                case "4":
                    contactBook.displayContacts();
                    break;

                case "5":
                    running = false;
                    break;

                default:
                    System.out.println("Невірний вибір, спробуйте ще раз.");
                    break;
            }
        }

        scanner.close();
        System.out.println("Програму завершено.");
    }
}

