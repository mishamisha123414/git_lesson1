package lesson_4;

    class Task1 {
    public static void main(String[] args) {
        int a, b;

        a = 3;
        b = 2;
        if (a <= 1 && b >= 3) {
            System.out.println("Сума: " + (a + b));
        } else {
            System.out.println("Різниця: " + (a - b));
        }
    }
}
public class Task2 {
    public static void main(String[] args) {
        int a, b;
        a = 3;
        b = 2;
        if ((a > 2 && a < 11) || (b >= 6 && b < 14)) {
            System.out.println("Вірно");
        } else {
            System.out.println("Невірно");
        }
    }
}
class Task3 {
    public static String getMonthString(String month) {
        switch (month.toLowerCase()) {
            case "january":
                return "Сьогодні на дворі січень";
            case "february":
                return "Сьогодні на дворі лютий";
            case "march":
                return "Сьогодні на дворі березень";
            case "april":
                return "Сьогодні на дворі квітень";
            case "may":
                return "Сьогодні на дворі травень";
            case "june":
                return "Сьогодні на дворі червень";
            case "july":
                return "Сьогодні на дворі липень";
            case "august":
                return "Сьогодні на дворі серпень";
            case "september":
                return "Сьогодні на дворі вересень";
            case "october":
                return "Сьогодні на дворі жовтень";
            case "november":
                return "Сьогодні на дворі листопад";
            case "december":
                return "Сьогодні на дворі грудень";
            default:
                return "Неправильний місяць";
        }
    }

    public static void main(String[] args) {
        String month = "july";
        System.out.println(getMonthString(month));
    }
}




