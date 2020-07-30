package oleksandrdiachenko.kyu5.DirReduction;

import org.junit.jupiter.api.Test;

import static oleksandrdiachenko.kyu5.DirReduction.Direction.*;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author : Oleksandr Diachenko
 * @since : 7/30/2020
 **/
class DirReductionTest {

    @Test
    void shouldGoWestWhenOnlyWestPassed() {
        String[] actual = DirReduction.dirReduc(new String[]{WEST.name()});

        assertThat(actual).containsExactly(WEST.name());
    }

    @Test
    void shouldStayWhenWestEastPassed() {
        String[] actual = DirReduction.dirReduc(new String[]{WEST.name(), EAST.name()});

        assertThat(actual).isEmpty();
    }

    @Test
    void shouldGoNorthEastSouthWhenNorthEastSouthPassed() {
        String[] actual = DirReduction.dirReduc(new String[]{NORTH.name(), EAST.name(), SOUTH.name()});

        assertThat(actual).containsExactly(NORTH.name(), EAST.name(), SOUTH.name());
    }

    @Test
    void shouldGoNorthEastSouthEastWhenNorthEastSouthEastPassed() {
        String[] actual = DirReduction.dirReduc(new String[]{NORTH.name(), EAST.name(), SOUTH.name(), EAST.name()});

        assertThat(actual).containsExactly(NORTH.name(), EAST.name(), SOUTH.name(), EAST.name());
    }

    @Test
    void shouldGoNorthEastWhenNorthEastSouthNorthPassed() {
        String[] actual = DirReduction.dirReduc(new String[]{NORTH.name(), EAST.name(), SOUTH.name(), NORTH.name()});

        assertThat(actual).containsExactly(NORTH.name(), EAST.name());
    }

    @Test
    void shouldGoNorthWhenNorthSouthNorthPassed() {
        String[] actual = DirReduction.dirReduc(new String[]{NORTH.name(), SOUTH.name(), NORTH.name()});

        assertThat(actual).containsExactly(NORTH.name());
    }

    @Test
    void shouldGoNort1hWhenNorthSouthNorthPassed() {
        String[] actual = DirReduction.dirReduc(new String[]{NORTH.name(), SOUTH.name(), SOUTH.name(), EAST.name(),
                WEST.name(), NORTH.name(), WEST.name()});

        assertThat(actual).containsExactly(WEST.name());
    }
}