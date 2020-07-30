package oleksandrdiachenko.kyu6.PangramChecker;

/**
 * @author : Oleksandr Diachenko
 * @since : 7/30/2020
 **/
public class PangramChecker {

    public boolean check(String sentence) {
        for (char c = 'a'; c < 'z'; c++) {
            if (doesntContainsChar(sentence, c)) {
                return false;
            }
        }
        return true;
    }

    private boolean doesntContainsChar(String sentence, char c) {
        String value = String.valueOf(c);
        return !sentence.toLowerCase().contains(value);
    }
}
