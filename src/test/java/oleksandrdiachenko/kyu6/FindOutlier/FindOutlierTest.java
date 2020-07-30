package oleksandrdiachenko.kyu6.FindOutlier;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author : Oleksandr Diachenko
 * @since : 7/30/2020
 **/
class FindOutlierTest {

    @Test
    void shouldReturn2When112Passed() {
        int actual = FindOutlier.find(new int[]{1, 1, 2});

        assertThat(actual).isEqualTo(2);
    }

    @Test
    void shouldReturn1When221Passed() {
        int actual = FindOutlier.find(new int[]{2, 2, 1});

        assertThat(actual).isEqualTo(1);
    }

    @Test
    void shouldReturn1When212Passed() {
        int actual = FindOutlier.find(new int[]{2, 1, 2});

        assertThat(actual).isEqualTo(1);
    }

    @Test
    void shouldReturn7When2674842Passed() {
        int actual = FindOutlier.find(new int[]{2, 6, 7, 4, 8, 4, 2});

        assertThat(actual).isEqualTo(7);
    }

    @Test
    void shouldReturn8When139853Passed() {
        int actual = FindOutlier.find(new int[]{1, 3, 9, 8, 5, 3});

        assertThat(actual).isEqualTo(8);
    }
}