package oleksandrdiachenko.kyu4.TopWords;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author : Oleksandr Diachenko
 * @since : 8/3/2020
 **/
class TopWordsTest {

    @Test
    void shouldReturn_A_When_A_Passed() {
        List<String> actual = TopWords.top3("A");

        assertThat(actual).containsExactly("a");
    }

    @Test
    void shouldReturn_A_When_A_A_B_Passed() {
        List<String> actual = TopWords.top3("A A B");

        assertThat(actual).containsExactly("a", "b");
    }

    @Test
    void shouldReturnEmptyWhenEmptyPassed() {
        List<String> actual = TopWords.top3("");

        assertThat(actual).isEmpty();
    }

    @Test
    void shouldReturn_AapostropheB_When_AapostropheB_Passed() {
        List<String> actual = TopWords.top3("A'B");

        assertThat(actual).containsExactly("a'b");
    }

    @Test
    void shouldReturn_A_When_AcommaA_B_Passed() {
        List<String> actual = TopWords.top3("A,A B");

        assertThat(actual).containsExactly("a", "b");
    }

    @Test
    void shouldReturn_A_B_When_A_A_A_B_B_Passed() {
        List<String> actual = TopWords.top3("A A A B B");

        assertThat(actual).containsExactly("a", "b");
    }

    @Test
    void shouldReturn_A_B_C_When_A_A_A_B_B_C_C_DPassed() {
        List<String> actual = TopWords.top3("A A A B B C C D");

        assertThat(actual).containsExactly("a", "b", "c");
    }

    @Test
    void shouldReturn_AB_C_D_When_AB_AB_AB_D_C_C_DPassed() {
        List<String> actual = TopWords.top3("AB AB AB D C C D");

        assertThat(actual).containsExactly("ab", "c", "d");
    }

    @Test
    void shouldReturn_E_DDD_AA_When_E_E_E_E_DDD_ddd_DdDdobledote_ddd_ddd_aa_aA_Aacomma_bb_cc_cC_e_e_e_Passed() {
        List<String> actual = TopWords.top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e");

        assertThat(actual).containsExactly("e", "ddd", "aa");
    }

    @Test
    void shouldReturn_wonAPOSTROPEt_wont_When_wont_wonAPOSTROPEt_wonAPOSTROPEt_Passed() {
        List<String> actual = TopWords.top3("  //wont won't won't ");

        assertThat(actual).containsExactly("won't", "wont");
    }

    @Test
    void shouldReturn_A_When_AdotA_Passed() {
        List<String> actual = TopWords.top3("A.A");

        assertThat(actual).containsExactly("a");
    }

    @Test
    void shouldReturnEmptyWhenApostrophePassed() {
        List<String> actual = TopWords.top3("'");

        assertThat(actual).isEmpty();
    }
}