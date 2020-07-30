package oleksandrdiachenko.kyu6.SpinWords;

import java.util.ArrayList;
import java.util.List;


/**
 * @author : Oleksandr Diachenko
 * @since : 7/30/2020
 **/
public class SpinWords {

    private static final int MIN_WORD_LENGTH_FOR_REVERSE = 5;

    public String spinWords(String sentence) {
        List<String> reversedWords = new ArrayList<>();
        for (String word : sentence.split(" ")) {
            reversedWords.add(reverse(word));
        }
        return String.join(" ", reversedWords);
    }

    private String reverse(String sentence) {
        if (sentence.length() >= MIN_WORD_LENGTH_FOR_REVERSE) {
            return new StringBuilder(sentence).reverse().toString();
        }
        return sentence;
    }
}
