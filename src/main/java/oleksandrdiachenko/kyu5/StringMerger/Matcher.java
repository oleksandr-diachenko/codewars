package oleksandrdiachenko.kyu5.StringMerger;

/**
 * @author : Oleksandr Diachenko
 * @since : 8/4/2020
 **/
public class Matcher {

    private final String str;
    private int index = 0;

    public Matcher(String str) {
        this.str = str == null ? "" : str;
    }

    public boolean match(char c) {
        boolean match = index < str.length() && str.charAt(index) == c;
        if (match) {
            index++;
        }
        return match;
    }

    public boolean isCompleted() {
        return str.length() == index;
    }
}
