package oleksandrdiachenko.kyu6.PangramChecker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author : Oleksandr Diachenko
 * @since : 7/30/2020
 **/
class PangramCheckerTest {

    private final PangramChecker checker = new PangramChecker();

    @Test
    void shouldReturnFalseWhenAPassed() {
        boolean actual = checker.check("A");

        assertThat(actual).isFalse();
    }

    @Test
    void shouldReturnFalseWhenBPassed() {
        boolean actual = checker.check("B");

        assertThat(actual).isFalse();
    }

    @Test
    void shouldReturnTrueWhenPanramPassed() {
        boolean actual = checker.check("The quick brown fox jumps over the lazy dog.");

        assertThat(actual).isTrue();
    }
}