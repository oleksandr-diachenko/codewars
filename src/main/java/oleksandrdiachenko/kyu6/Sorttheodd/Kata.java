package oleksandrdiachenko.kyu6.Sorttheodd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author : Oleksandr Diachenko
 * @since : 7/31/2020
 **/
public class Kata {

    public static int[] sortArray(int[] array) {
        List<Integer> odds = new ArrayList<>();
        for (int number : array) {
            if (isOdd(number)) {
                odds.add(number);
            }
        }
        Collections.sort(odds);
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            if (isOdd(number)) {
                array[i] = odds.get(index++);
            }
        }
        return array;
    }

    private static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}
