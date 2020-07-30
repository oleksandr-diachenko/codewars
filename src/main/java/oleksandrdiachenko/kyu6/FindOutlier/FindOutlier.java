package oleksandrdiachenko.kyu6.FindOutlier;

/**
 * @author : Oleksandr Diachenko
 * @since : 7/30/2020
 **/
public class FindOutlier {

    static int find(int[] integers) {
        int oddCount = 0;
        int lastOdd = 0;
        int lastEven = 0;
        for (int number : integers) {
            if (isEven(number)) {
                lastEven = number;
            } else {
                oddCount++;
                lastOdd = number;
            }
        }
        if (oddCount == 1) {
            return lastOdd;
        } else {
            return lastEven;
        }
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
