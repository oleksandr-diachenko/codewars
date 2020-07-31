package oleksandrdiachenko.kyu6.WhoLikesIt;

/**
 * @author : Oleksandr Diachenko
 * @since : 7/31/2020
 **/
public interface Like {

    boolean shouldExecute(String... names);

    String execute(String... names);
}
