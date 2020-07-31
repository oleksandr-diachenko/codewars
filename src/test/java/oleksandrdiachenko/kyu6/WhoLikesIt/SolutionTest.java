package oleksandrdiachenko.kyu6.WhoLikesIt;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author : Oleksandr Diachenko
 * @since : 7/31/2020
 **/
class SolutionTest {

    @Test
    void shouldReturnOoOneLikesThisWhenArrayIsEmpty() {
        String actual = Solution.whoLikesIt();

        assertThat(actual).isEqualTo("no one likes this");
    }

    @Test
    void shouldReturnPeterLikesThisWhenPeterPassed() {
        String actual = Solution.whoLikesIt("Peter");

        assertThat(actual).isEqualTo("Peter likes this");
    }

    @Test
    void shouldReturnJacobAndAlexLikeThisWhenJacobAndAlexPassed() {
        String actual = Solution.whoLikesIt("Jacob", "Alex");

        assertThat(actual).isEqualTo("Jacob and Alex like this");
    }

    @Test
    void shouldReturnMaxJohnAndMarkLikeThisWhenMaxJohnAndMarkPassed() {
        String actual = Solution.whoLikesIt("Max", "John", "Mark");

        assertThat(actual).isEqualTo("Max, John and Mark like this");
    }

    @Test
    void shouldReturnAlexJacobAnd2OthersLikeThisWhenAlexJacobMarkMaxPassed() {
        String actual = Solution.whoLikesIt("Alex", "Jacob", "Mark", "Max");

        assertThat(actual).isEqualTo("Alex, Jacob and 2 others like this");
    }
}