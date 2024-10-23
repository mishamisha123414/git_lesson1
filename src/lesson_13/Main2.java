package lesson_13;

public class Main2 {
    public static boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        boolean result = isPalindrome("madam");
        System.out.println(result);  // Виведе: true
    }
}

