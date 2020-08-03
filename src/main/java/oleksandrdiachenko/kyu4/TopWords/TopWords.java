package oleksandrdiachenko.kyu4.TopWords;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import static java.util.Comparator.reverseOrder;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toList;

/**
 * @author : Oleksandr Diachenko
 * @since : 8/3/2020
 **/
public class TopWords {

    public static List<String> top3(String input) {
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String word : getWords(input)) {
            wordsCount.merge(word.toLowerCase(), 1, Integer::sum);
        }
        return wordsCount.entrySet().stream()
                .sorted(comparingByValue(reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(toList());
    }

    private static String[] getWords(String input) {
        return Arrays.stream(input
                .replaceAll("[^\\p{Alnum} & ']+", " ")
                .split(" "))
                .filter(word -> Pattern.compile(".*[a-zA-Z]+.*").matcher(word).matches())
                .toArray(String[]::new);
    }
}
