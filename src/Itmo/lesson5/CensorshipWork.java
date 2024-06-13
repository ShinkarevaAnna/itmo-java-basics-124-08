package Itmo.lesson5;

public class CensorshipWork {
    public static String censorshipWork(String str) {
        String censorPhrase = "";
        if (str != null || !str.isEmpty()) {
            censorPhrase = str.replace("бяка", "[вырезано цензурой]");
        }
        return censorPhrase;
    }

    public static void main(String[] args) {
        String originalPhrase = "С точки зрения банальной эрудиции бяка, не каждый человеческий индивидуум бяка способен лояльно реагироать бяка на все тенденции потенциального действия бяка";
        String censorPhrase = censorshipWork(originalPhrase);
        System.out.println("original phrase: " + originalPhrase);
        System.out.println("censor phrase: " + censorPhrase);
    }
}