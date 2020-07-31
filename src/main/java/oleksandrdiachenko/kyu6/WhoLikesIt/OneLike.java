package oleksandrdiachenko.kyu6.WhoLikesIt;

import static java.lang.String.format;

/**
 * @author : Oleksandr Diachenko
 * @since : 7/31/2020
 **/
public class OneLike implements Like {

    private static final String LIKES_THIS1 = "%s likes this";

    @Override
    public boolean shouldExecute(String... names) {
        return names.length == 1;
    }

    @Override
    public String execute(String... names) {
        return format(LIKES_THIS1, names[0]);
    }
}
