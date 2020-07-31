package oleksandrdiachenko.kyu6.WhoLikesIt;

import static java.lang.String.format;

/**
 * @author : Oleksandr Diachenko
 * @since : 7/31/2020
 **/
public class ThreeLike implements Like {

    private static final String LIKE_THIS3 = "%s, %s and %s like this";

    @Override
    public boolean shouldExecute(String... names) {
        return names.length == 3;
    }

    @Override
    public String execute(String... names) {
        return format(LIKE_THIS3, names[0], names[1], names[2]);
    }
}
