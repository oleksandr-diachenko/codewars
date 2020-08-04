package oleksandrdiachenko.kyu5.PaginationHelper;

import java.util.List;

/**
 * @author : Oleksandr Diachenko
 * @since : 8/4/2020
 **/
public class PaginationHelper<I> {

    private final List<I> collection;
    private final int itemsPerPage;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return (int) Math.ceil(collection.size() / (double) this.itemsPerPage);
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        if (pageIndex == pageCount() - 1) {
            return collection.size() % itemsPerPage;
        } else if (pageIndex > pageCount() - 1 || pageIndex < 0) {
            return -1;
        } else {
            return itemsPerPage;
        }

    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if (collection.isEmpty() || collection.size() < itemIndex - 1 || itemIndex < 0) {
            return -1;
        } else {
            return itemIndex / itemsPerPage;
        }
    }
}