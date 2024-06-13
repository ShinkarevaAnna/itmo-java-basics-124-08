package Itmo.lesson5;

public class PalindromeWord {
    public static String palindrome(String string) {
        String palindrome = "";
        if (string != null || !string.isEmpty()) {
            StringBuilder stb = new StringBuilder(string);
            palindrome = String.valueOf(stb.reverse());
        }
        return palindrome;
    }

    public static boolean equals(String s, String str) {
        return s.equalsIgnoreCase(str);
    }

    public static void main(String[] args) {
        String initialWord = "giggle";
        String originalWord = "peep";
        String palindrome = palindrome(initialWord);
        String palindrome2 = palindrome(originalWord);
        System.out.println("original: " + initialWord + ", palindrome: " + palindrome + ", isPalindrome: " +
                equals(initialWord, palindrome));
        System.out.println("original: " + originalWord + ", palindrome: " + palindrome2 + ", isPalindrome: " +
                equals(originalWord, palindrome2));
    }
}