package oleksandrdiachenko.kyu5.StringMerger;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author : Oleksandr Diachenko
 * @since : 8/4/2020
 **/
class StringMergerTest {

    @Test
    void shouldReturnFalseWhen_AB_A_C_Passed() {
        boolean actual = StringMerger.isMerge("AB", "A", "C");

        assertThat(actual).isFalse();
    }

    @Test
    void shouldReturnTrueWhen_AB_A_B_Passed() {
        boolean actual = StringMerger.isMerge("AB", "A", "B");

        assertThat(actual).isTrue();
    }

    @Test
    void shouldReturnTrueEmptyPassed() {
        boolean actual = StringMerger.isMerge("", "", "");

        assertThat(actual).isTrue();
    }

    @Test
    void shouldReturnFalse_Empty__A_B_Passed() {
        boolean actual = StringMerger.isMerge("", "A", "B");

        assertThat(actual).isFalse();
    }

    @Test
    void shouldReturnTrueWhen_GoingBananas__Nbnaas_Goigan_Passed() {
        boolean actual = StringMerger.isMerge("Going bananas!", "n bnaas", "Goigan!");

        assertThat(actual).isTrue();
    }

    @Test
    void shouldReturnFalseWhen_ABC__A_CB_Passed() {
        boolean actual = StringMerger.isMerge("ABC", "A", "CB");

        assertThat(actual).isFalse();
    }

    @Test
    void shouldReturnFalseWhen_ABC__Empty_Empty_Passed() {
        boolean actual = StringMerger.isMerge("ABC", "", "");

        assertThat(actual).isFalse();
    }

    @Test
    void shouldReturnTrueWhen_AB__A1_B_Passed() {
        boolean actual = StringMerger.isMerge("AB!", "A!", "B");

        assertThat(actual).isTrue();
    }

    @Test
    void shouldReturnFalseWhen_AB__1A_B_Passed() {
        boolean actual = StringMerger.isMerge("AB!", "!A", "B");

        assertThat(actual).isFalse();
    }

    @Test
    void shouldReturnFalseWhen_AB__null_B_Passed() {
        boolean actual = StringMerger.isMerge("AB", null, "B");

        assertThat(actual).isFalse();
    }

    @Test
    void shouldReturnFalseWhen_AB__A_null_Passed() {
        boolean actual = StringMerger.isMerge("AB", "A", null);

        assertThat(actual).isFalse();
    }

    @Test
    void shouldReturnTrueWhen_AB__null_AB_Passed() {
        boolean actual = StringMerger.isMerge("AB", null, "AB");

        assertThat(actual).isTrue();
    }

    @Test
    void shouldReturnTrueWhen_AB__AB_null_Passed() {
        boolean actual = StringMerger.isMerge("AB", "AB", null);

        assertThat(actual).isTrue();
    }

    @Test
    void shouldReturnTrueWhen_AAB__A_AB_Passed() {
        boolean actual = StringMerger.isMerge("AAB", "A", "AB");

        assertThat(actual).isTrue();
    }

    @Test
    void shouldReturnTrueWhen_AAB__AB_A_Passed() {
        boolean actual = StringMerger.isMerge("AAB", "AB", "A");

        assertThat(actual).isTrue();
    }

    @Test
    void shouldReturnTrueWhen_Yeswe__esw_Ye_Passed() {
        boolean actual = StringMerger.isMerge("Yes we", "es w", "Ye");

        assertThat(actual).isTrue();
    }

    @Test
    void shouldReturnTrueWhen_ABspaceC__A_BC_Passed() {
        boolean actual = StringMerger.isMerge("AB C", "A", "B C");

        assertThat(actual).isTrue();
    }

    @Test
    void shouldReturnTrueWhen_ABspaceC__AB_C_Passed() {
        boolean actual = StringMerger.isMerge("AB C", "AB", " C");

        assertThat(actual).isTrue();
    }

    @Test
    void shouldReturnTrueWhen_spaceABspaceC__AB_C_Passed() {
        boolean actual = StringMerger.isMerge(" AB C", " A ", "BC");

        assertThat(actual).isTrue();
    }
}