package oleksandrdiachenko.kyu5.PigLatin;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Oleksandr Diachenko
 * @since : 9/14/2020
 **/
public class PigLatin {

    public static String pigIt(String str) {
        if (str.isEmpty()) {
            return "";
        }
        List<String> reversedWords = new ArrayList<>();
        for (String word : str.split(" ")) {
            if (Character.isLetter(word.charAt(0))) {
                reversedWords.add(swapWord(word));
            } else {
                reversedWords.add(word);
            }
        }
        return String.join(" ", reversedWords);
    }

    private static String swapWord(String str) {
        char[] chars = str.toCharArray();
        for (int index = 0; index < chars.length - 1; index++) {
            swap(chars, index);
        }

        return String.valueOf(chars) + "ay";
    }

    private static void swap(char[] chars, int index) {
        char current = chars[index];
        char next = chars[index + 1];
        chars[index + 1] = current;
        chars[index] = next;
    }
}
