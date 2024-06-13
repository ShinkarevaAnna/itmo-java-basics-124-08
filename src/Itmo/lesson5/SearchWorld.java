package Itmo.lesson5;

public class SearchWorld {

    public static void searchLongWord(String s) {
        if (s != null || !s.isEmpty()) {
            String[] split = s.split(" ");
            int maxLength = 0;
            String longestWord= "";
            for (String str : split) {
                if (str.length() > maxLength) {
                    maxLength = str.length();
                    longestWord = str;
                }
            }
            System.out.println("The longest word is " + longestWord);
        }
    }

    public static void main(String[] args) {
        String shakespeare = "To be, or not to be, that is the question: Whether 'tis nobler in the mind to suffer The slings and arrows of outrageous fortune, Or to take arms against a sea of troubles And by opposing end them.";
        searchLongWord(shakespeare);
    }
}
