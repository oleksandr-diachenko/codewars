package oleksandrdiachenko.kyu6.Persist;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author : Oleksandr Diachenko
 * @since : 7/30/2020
 **/
class PersistTest {

    @Test
    void shouldReturn1When1Passed() {
        int actual = Persist.persistence(1);

        assertThat(actual).isZero();
    }

    @Test
    void shouldReturn2When2Passed() {
        int actual = Persist.persistence(2);

        assertThat(actual).isZero();
    }

    @Test
    void shouldReturn2When12Passed() {
        int actual = Persist.persistence(12);

        assertThat(actual).isEqualTo(1);
    }

    @Test
    void shouldReturn8When234Passed() {
        int actual = Persist.persistence(234);

        assertThat(actual).isEqualTo(2);
    }
}