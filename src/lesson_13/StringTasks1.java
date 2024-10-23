package lesson_13;

public class StringTasks1 {
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        String result = reverseString("hello");
        System.out.println(result);
    }
}



