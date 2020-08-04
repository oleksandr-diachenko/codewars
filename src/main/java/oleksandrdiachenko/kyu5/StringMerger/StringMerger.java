package oleksandrdiachenko.kyu5.StringMerger;

import java.util.List;

/**
 * @author : Oleksandr Diachenko
 * @since : 8/4/2020
 **/
public class StringMerger {

    public static boolean isMerge(String str, String part1, String part2) {
        List<Matcher> matchers = List.of(new Matcher(part1), new Matcher(part2));
        for (char current : str.toCharArray()) {
            if (noneMatch(matchers, current))
                return false;
        }
        return matchers.stream()
                .allMatch(Matcher::isCompleted);
    }

    private static boolean noneMatch(List<Matcher> matchers, char current) {
        return matchers.stream()
                .noneMatch(matcher -> matcher.match(current));
    }
}
