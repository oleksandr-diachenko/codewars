package oleksandrdiachenko.kyu5.PaginationHelper;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author : Oleksandr Diachenko
 * @since : 8/4/2020
 **/
class PaginationHelperTest {

    @Test
    void shouldReturnItemCount1WhenAAnd1Passed() {
        PaginationHelper<String> pagination = new PaginationHelper<>(List.of("A"), 1);

        assertThat(pagination.itemCount()).isEqualTo(1);
    }

    @Test
    void shouldReturnItemCount3WhenABCAnd2Passed() {
        PaginationHelper<String> pagination = new PaginationHelper<>(List.of("A", "B", "C"), 2);

        assertThat(pagination.itemCount()).isEqualTo(3);
    }

    @Test
    void shouldReturnPageCount1WhenAAnd1Passed() {
        PaginationHelper<String> pagination = new PaginationHelper<>(List.of("A"), 1);

        assertThat(pagination.pageCount()).isEqualTo(1);
    }

    @Test
    void shouldReturnPageCount2WhenABCAnd2Passed() {
        PaginationHelper<String> pagination = new PaginationHelper<>(List.of("A", "B", "C"), 2);

        assertThat(pagination.pageCount()).isEqualTo(2);
    }

    @Test
    void shouldReturnPageCount2WhenABCDAnd2Passed() {
        PaginationHelper<String> pagination = new PaginationHelper<>(List.of("A", "B", "C", "D"), 2);

        assertThat(pagination.pageCount()).isEqualTo(2);
    }

    @Test
    void shouldReturnPageItemCount2OnFirstPageWhenABAnd1Passed() {
        PaginationHelper<String> pagination = new PaginationHelper<>(List.of("A", "B"), 1);

        assertThat(pagination.pageItemCount(0)).isEqualTo(1);
    }

    @Test
    void shouldReturnPageItemCount1OnSecondPageWhenABCAnd2Passed() {
        PaginationHelper<String> pagination = new PaginationHelper<>(List.of("A", "B", "C"), 2);

        assertThat(pagination.pageItemCount(1)).isEqualTo(1);
    }

    @Test
    void shouldReturnPageItemCount2OnSecondPageWhenABCDEAnd2Passed() {
        PaginationHelper<String> pagination = new PaginationHelper<>(List.of("A", "B", "C", "D", "E"), 2);

        assertThat(pagination.pageItemCount(1)).isEqualTo(2);
    }

    @Test
    void shouldReturnPageItemCountMinus1OnSecondPageWhenAAnd1Passed() {
        PaginationHelper<String> pagination = new PaginationHelper<>(List.of("A"), 1);

        assertThat(pagination.pageItemCount(1)).isEqualTo(-1);
    }

    @Test
    void shouldReturnPageItemCount2OnFirstPageWhenAAnd1Passed() {
        PaginationHelper<String> pagination = new PaginationHelper<>(List.of("A", "A"), 1);

        assertThat(pagination.pageItemCount(0)).isEqualTo(1);
    }
}