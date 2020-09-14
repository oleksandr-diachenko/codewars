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
}