package Itmo.lesson5;

public class PalindromeWord {
    public static boolean isPalindrome(String s) {
        boolean isPalindrome = false;
        if (s != null || !s.isEmpty()) {
            StringBuilder stb = new StringBuilder(s);
             isPalindrome = s.equalsIgnoreCase(String.valueOf(stb.reverse()));
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