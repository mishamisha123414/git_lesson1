package Homework15;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private Scanner scanner;
    private ArrayList<MenuActions> actions;

    public Menu(Scanner scanner){
        this.actions = new ArrayList<>();
        this.scanner = scanner;
    }

    public void addMenuAction(MenuActions action){
        actions.add(action);
    }

    public void run() {
        while (true) {
            showMenuAction();
            System.out.println("Виберіть пункт меню: ");
            if (scanner.hasNextInt()){
                int choice = scanner.nextInt();
                if(!checkArrayBounds(choice)){
                    scanner.nextLine();
                    actions.get(choice - 1).execute();
                } else {
                    System.out.println("Ви обрали невірний пункт меню");
                    System.out.println("Оберіть будь ласка правильний пункт");
                }
            } else {
                scanner.nextLine();
                System.out.println("Ви ввели некоректні дані");
                System.out.println("Оберіть будь ласка index для вашой дії");
            }
        }
    }

    private void showMenuAction(){
        for (int i = 0; i < actions.size(); i++) {
            String name = actions.get(i).getName();
            System.out.println(i+1 + " " + name);
        }
    }

    private boolean checkArrayBounds(int index){
        return index < 0 || index > actions.size();
    }



}
