package oleksandrdiachenko.kyu6.SpinWords;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author : Oleksandr Diachenko
 * @since : 7/30/2020
 **/
class SpinWordsTest {

    private final SpinWords spinWords = new SpinWords();

    @Test
    void shouldReturnAWhenAPassed() {
        String actual = spinWords.spinWords("A");

        assertThat(actual).isEqualTo("A");
    }

    @Test
    void shouldReturnBWhenBPassed() {
        String actual = spinWords.spinWords("B");

        assertThat(actual).isEqualTo("B");
    }

    @Test
    void shouldReturnABCDWhenABCDPassed() {
        String actual = spinWords.spinWords("ABCD");

        assertThat(actual).isEqualTo("ABCD");
    }

    @Test
    void shouldReturnEDCBAWhenABCDEPassed() {
        String actual = spinWords.spinWords("ABCDE");

        assertThat(actual).isEqualTo("EDCBA");
    }

    @Test
    void shouldReturnA_EDCBAWhenA_ABCDEPassed() {
        String actual = spinWords.spinWords("A ABCDE");

        assertThat(actual).isEqualTo("A EDCBA");
    }

    @Test
    void shouldReturnJIHGF_EDCBAWhenFGHIJ_ABCDEPassed() {
        String actual = spinWords.spinWords("FGHIJ ABCDE");

        assertThat(actual).isEqualTo("JIHGF EDCBA");
    }
}