package oleksandrdiachenko.kyu5.PigLatin;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author : Oleksandr Diachenko
 * @since : 9/14/2020
 **/
class PigLatinTest {

    @Test
    void shouldReturnEmptyWhenEmptyPassed() {
        String actual = PigLatin.pigIt("");

        assertThat(actual).isEmpty();
    }

    @Test
    void shouldReturn_Aay_When_A_Passed() {
        String actual = PigLatin.pigIt("A");

        assertThat(actual).isEqualTo("Aay");
    }

    @Test
    void shouldReturn_BAay_When_A_Passed() {
        String actual = PigLatin.pigIt("AB");

        assertThat(actual).isEqualTo("BAay");
    }

    @Test
    void shouldReturn_Aay_Bay_When_A_B_Passed() {
        String actual = PigLatin.pigIt("A B");

        assertThat(actual).isEqualTo("Aay Bay");
    }

    @Test
    void shouldReturn_Aay_1_When_A_1_Passed() {
        String actual = PigLatin.pigIt("A !");

        assertThat(actual).isEqualTo("Aay !");
    }
}