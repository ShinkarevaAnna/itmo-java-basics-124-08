package Itmo.lessonString;

public class InversionWords {
    public static String inversionString(String s) {
        String cipher = "";
        if (s != null || !s.isEmpty()) {
            String[] temporary = s.split(" ");

            for (String element : temporary) {
                StringBuilder stb = new StringBuilder(element);
                cipher += stb.reverse() + " ";
            }
        }
        return cipher;
    }

    public static void main(String[] args) {
        String dollarBill = "In Gog we trust";
        System.out.println("The given string is: " + dollarBill);
        System.out.println("The string reversed word by word is: " + inversionString(dollarBill));

    }
}