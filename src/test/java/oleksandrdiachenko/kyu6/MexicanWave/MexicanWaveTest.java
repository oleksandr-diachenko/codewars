package oleksandrdiachenko.kyu6.MexicanWave;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author : Oleksandr Diachenko
 * @since : 7/31/2020
 **/
class MexicanWaveTest {

    @Test
    void shouldReturnEmptyArrayWhenEmptyPassed() {
        String[] actual = MexicanWave.wave("");

        assertThat(actual).isEmpty();
    }

    @Test
    void shouldReturn_A_When_a_Passed() {
        String[] actual = MexicanWave.wave("a");

        assertThat(actual).containsExactly("A");
    }

    @Test
    void shouldReturn_Ab_aB_When_ab_Passed() {
        String[] actual = MexicanWave.wave("ab");

        assertThat(actual).containsExactly("Ab", "aB");
    }

    @Test
    void shouldReturn_Abc_bAc_abC_When_abc_Passed() {
        String[] actual = MexicanWave.wave("abc");

        assertThat(actual).containsExactly("Abc", "aBc", "abC");
    }

    @Test
    void shouldReturn__A__When__a__Passed() {
        String[] actual = MexicanWave.wave(" a ");

        assertThat(actual).containsExactly(" A ");
    }

    @Test
    void shouldReturn_Ab_cd__aB_cd__ab_Cd__ab_cD_When_ab__cd_Passed() {
        String[] actual = MexicanWave.wave("ab cd");

        assertThat(actual).containsExactly("Ab cd", "aB cd", "ab Cd", "ab cD");
    }
}