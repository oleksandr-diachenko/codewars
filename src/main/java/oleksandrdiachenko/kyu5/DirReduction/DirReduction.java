package oleksandrdiachenko.kyu5.DirReduction;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static java.util.stream.Collectors.toList;

/**
 * @author : Oleksandr Diachenko
 * @since : 7/30/2020
 **/
public class DirReduction {

    public static String[] dirReduc(String[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        List<Direction> directions = getDirections(arr);

        for (int i = 0; i < directions.size() - 1; i++) {
            Direction current = directions.get(i);
            Direction opposite = current.getOpposite();
            Direction next = directions.get(i + 1);
            if (next == opposite) {
                directions.set(i, null);
                directions.set(i + 1, null);
                i++;
            }
        }

        String[] newArr = directions.stream()
                .filter(Objects::nonNull)
                .map(Enum::name)
                .toArray(String[]::new);

        if (newArr.length == arr.length) {
            return arr;
        } else {
            return dirReduc(newArr);
        }
    }

    private static List<Direction> getDirections(String[] arr) {
        return Arrays.stream(arr)
                .map(Direction::valueOf)
                .collect(toList());
    }
}
