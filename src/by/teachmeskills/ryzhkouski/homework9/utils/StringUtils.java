package by.teachmeskills.ryzhkouski.homework9.utils;

public class StringUtils {
    public static void print (String text) {
        char [] textToChar = text.toCharArray();
        for (char i : textToChar) {
            System.out.println(i);
        }
    }

    public static void println (String text) {
        for (char i : text.toCharArray()) {
            System.out.println(i + "\n");
        }
    }

    public static boolean isBlank (String text) {
        boolean isBlank = false;
        char [] textToChar = text.toCharArray();
        if (textToChar.length == 0) {
            isBlank = true;
        }
        for (int i = 0; i < textToChar.length; i++) {
            if (textToChar[i] == ' ' || textToChar[i] == '\t' || textToChar[i] == '\r' || textToChar[i] == '\n') {
                isBlank = true;
            }
        }
        return isBlank;
    }

    public static boolean isRussian (String text) {
        char [] textToChar = text.toCharArray();
        boolean word = false;
        for (int i = 0; i < textToChar.length; i++) {
            if ((textToChar[i] >= 'а' && textToChar[i] <= 'я') || (textToChar[i] >= 'A' && textToChar[i] <= 'Я')) {
                word = true;
            } else {
                word = false;
                return word;
            }
        } return word;
    }

    public static boolean contains (String text, String text2) {
        boolean word = false;
        int k = 0;
        char [] textToChar = text.toCharArray();
        char [] textToChar2 = text2.toCharArray();

    }
}
