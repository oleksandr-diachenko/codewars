package oleksandrdiachenko.kyu6.StringSplit;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author : Oleksandr Diachenko
 * @since : 7/30/2020
 **/
class StringSplitTest {

    @Test
    void shouldReturnABWhenABPassed() {
        String[] actual = StringSplit.solution("AB");

        assertThat(actual).containsExactly("AB");
    }

    @Test
    void shouldReturnAB_CDWhenABCDPassed() {
        String[] actual = StringSplit.solution("ABCD");

        assertThat(actual).containsExactly("AB", "CD");
    }

    @Test
    void shouldReturnAB_CD_EFWhenABCDEFPassed() {
        String[] actual = StringSplit.solution("ABCDEF");

        assertThat(actual).containsExactly("AB", "CD", "EF");
    }

    @Test
    void shouldReturnA_WhenAPassed() {
        String[] actual = StringSplit.solution("A");

        assertThat(actual).containsExactly("A_");
    }
}