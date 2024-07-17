package Itmo.lessonString;

public class NumberSubstrings {
    public static int numberSubstrings(String str, String s) {
        int numberSubstrings = 0;
        if (str != null || !str.isEmpty()) {
            String[] string = str.split(" ");
            for (String element : string) {
                if (element.equals(s)) {
                    numberSubstrings += 1;
                }
            }
        }
        return numberSubstrings;
    }

    public static void main(String[] args) {
        String longPhrase = "nobody nobody nobody nobody can use StringBuffer";
        String smallPhrase = "nobody";
        System.out.println("number substrings is " + numberSubstrings(longPhrase, smallPhrase));
    }
}