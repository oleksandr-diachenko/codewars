package oleksandrdiachenko.kyu6.MexicanWave;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.toUpperCase;

/**
 * @author : Oleksandr Diachenko
 * @since : 7/31/2020
 **/
public class MexicanWave {

    public static String[] wave(String input) {
        char[] chars = input.toCharArray();
        List<String> result = new ArrayList<>();
        for (int index = 0; index < chars.length; index++) {
            char current = toUpperCase(chars[index]);
            if(isNotSpace(current)) {
                String prev = input.substring(0, index);
                String next = input.substring(index + 1);
                result.add(prev + current + next);
            }
        }
        return result.toArray(new String[0]);
    }

    private static boolean isNotSpace(char c) {
        return c != ' ';
    }
}
