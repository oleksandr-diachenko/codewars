package oleksandrdiachenko.kyu6.StringSplit;

/**
 * @author : Oleksandr Diachenko
 * @since : 7/30/2020
 **/
public class StringSplit {

    public static String[] solution(String input) {
        input = addUnderscoreIfNeeded(input);
        String[] result = new String[input.length() / 2];
        int index = 0;
        for (int i = 0; i < input.length() - 1; i += 2, index++) {
            result[index] = "" + input.charAt(i) + input.charAt(i + 1);
        }
        return result;
    }

    private static String addUnderscoreIfNeeded(String input) {
        if (input.length() % 2 != 0) {
            input += "_";
        }
        return input;
    }
}
