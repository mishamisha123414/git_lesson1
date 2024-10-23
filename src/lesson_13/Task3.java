package lesson_13;

public class Task3 {
    public static String[] splitIntoWords(String input) {
        return input.split(" ");
    }

    public static void main(String[] args) {
        String[] words = splitIntoWords("hello world");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
//!Та ще я зробив з toCharArray:
//public class CharArrayConverter {
//    public static char[] stringToCharArray(String input) {
//        return input.toCharArray();
//    }
//
//    public static void main(String[] args) {
//        char[] chars = stringToCharArray("hello world");
//
//        for (char ch : chars) {
//            System.out.println(ch);
//        }
//    }
//}

