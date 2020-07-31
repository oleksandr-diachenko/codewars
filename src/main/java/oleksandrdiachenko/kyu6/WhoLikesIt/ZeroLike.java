package oleksandrdiachenko.kyu6.WhoLikesIt;

/**
 * @author : Oleksandr Diachenko
 * @since : 7/31/2020
 **/
public class ZeroLike implements Like {

    public static final String NO_ONE_LIKES_THIS = "no one likes this";

    @Override
    public boolean shouldExecute(String... names) {
        return names.length == 0;
    }

    @Override
    public String execute(String... names) {
        return NO_ONE_LIKES_THIS;
    }
}
