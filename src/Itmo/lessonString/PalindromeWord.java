package Itmo.lessonString;

public class PalindromeWord {
    public static boolean isPalindrome(String s) {
        boolean isPalindrome = false;
        if (s != null || !s.isEmpty()) {
            StringBuilder stb = new StringBuilder(s);
             isPalindrome = s.equalsIgnoreCase(stb.reverse().toString());
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        String initialWord = "giggle";
        String originalWord = "peep";
        System.out.println("original: " + initialWord + ", isPalindrome: " + isPalindrome(initialWord));
        System.out.println("original: " + originalWord + ", isPalindrome: " + isPalindrome(originalWord));
    }
}