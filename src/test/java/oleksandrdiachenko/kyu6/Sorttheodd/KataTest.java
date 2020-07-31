package oleksandrdiachenko.kyu6.Sorttheodd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author : Oleksandr Diachenko
 * @since : 7/31/2020
 **/
class KataTest {

    @Test
    void shouldReturn1When1Passed() {
        int[] actual = Kata.sortArray(new int[]{1});

        assertThat(actual).containsExactly(1);
    }

    @Test
    void shouldReturn12When12Passed() {
        int[] actual = Kata.sortArray(new int[]{1, 2});

        assertThat(actual).containsExactly(1, 2);
    }

    @Test
    void shouldReturn321When123Passed() {
        int[] actual = Kata.sortArray(new int[]{3, 2, 1});

        assertThat(actual).containsExactly(1, 2, 3);
    }

    @Test
    void shouldReturn11435027When53471021Passed() {
        int[] actual = Kata.sortArray(new int[]{5, 3, 4, 7, 1, 0, 2, 1});

        assertThat(actual).containsExactly(1, 1, 4, 3, 5, 0, 2, 7);
    }
}