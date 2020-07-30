package oleksandrdiachenko.kyu6.Persist;

import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * @author : Oleksandr Diachenko
 * @since : 7/30/2020
 **/
public class Persist {

    public static int persistence(long number) {
        int count = 0;
        char[] chars = getChars(number);
        if(chars.length == 1) {
            return count;
        }
        while (chars.length > 1) {
            long multiply = 1;
            for (char c : chars) {
                multiply *= Character.getNumericValue(c);
            }
            number = multiply;
            chars = getChars(number);
            count++;
        }
        return count;
    }

    private static char[] getChars(long number) {
        return String.valueOf(number).toCharArray();
    }
}
