package Itmo.lessonString;

public class CensorshipWork {
    public static String censorshipWork(String phrase, String wordInText, String wordReplace) {
        String censorPhrase = "";
        if (phrase != null || !phrase.isEmpty()) {
            censorPhrase = phrase.replace(wordInText,wordReplace);
        }
        return censorPhrase;
    }

    public static void main(String[] args) {
        String originalPhrase = "С точки зрения банальной эрудиции бяка, не каждый человеческий индивидуум бяка способен лояльно реагироать бяка на все тенденции потенциального действия бяка";
        String wordInText = "бяка";
        String wordReplace = "[вырезано цензурой]";
        String censorPhrase = censorshipWork(originalPhrase, wordInText, wordReplace);
        System.out.println("original phrase: " + originalPhrase);
        System.out.println("censor phrase: " + censorPhrase);
    }
}