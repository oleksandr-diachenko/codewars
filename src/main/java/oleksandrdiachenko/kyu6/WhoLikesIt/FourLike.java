package oleksandrdiachenko.kyu6.WhoLikesIt;

import static java.lang.String.format;

/**
 * @author : Oleksandr Diachenko
 * @since : 7/31/2020
 **/
public class FourLike implements Like {

    private static final String LIKE_THIS4 = "%s, %s and %s others like this";

    @Override
    public boolean shouldExecute(String... names) {
        return names.length == 4;
    }

    @Override
    public String execute(String... names) {
        return format(LIKE_THIS4, names[0], names[1], names.length - 2);
    }
}
