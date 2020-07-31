package oleksandrdiachenko.kyu6.WhoLikesIt;

import java.util.List;

/**
 * @author : Oleksandr Diachenko
 * @since : 7/31/2020
 **/
public class Solution {

    private static final List<Like> likes = List.of(new ZeroLike(), new OneLike(), new TwoLike(), new ThreeLike(), new FourLike());

    public static String whoLikesIt(String... names) {
        for (Like like : likes) {
            if (like.shouldExecute(names)) {
                return like.execute(names);
            }
        }
        return "";
    }
}
