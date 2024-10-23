package lesson_17;

//В цьому проекті я зробив один класс Main який охоплює 3 анонімних класів,які виконують функціі:
import java.util.Date;

interface Action {
    void perform();
}

public class Main {
    public static void main(String[] args) {
        Action greetAction = new Action() {
            @Override
            public void perform() {
                System.out.println("Привіт! Ласкаво просимо до нашої програми.");
            }
        };

        Action sumAction = new Action() {
            @Override
            public void perform() {
                int a = 5;
                int b = 7;
                System.out.println("Результат складання: " + (a + b));
            }
        };

        Action dateAction = new Action() {
            @Override
            public void perform() {
                Date currentDate = new Date();
                System.out.println("Поточна дата: " + currentDate);
            }
        };

        //Тут я зробив виконання дій всьго проекту:
        greetAction.perform();
        sumAction.perform();
        dateAction.perform();
    }
}

