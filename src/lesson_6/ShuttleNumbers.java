package lesson_6;

public class ShuttleNumbers {

    public static void main(String[] args) {
        printShuttleNumbers();
    }

    public static void printShuttleNumbers() {
        int count = 0; 

        for (int number = 1; count < 100; number++) {
            if (!containsUnluckyDigits(number)) {
                System.out.println("Shuttle #" + number);
                count++;
            }
        }
    }

    public static boolean containsUnluckyDigits(int number) {
        String numberStr = String.valueOf(number);
        return numberStr.contains("4") || numberStr.contains("9");
    }
}


