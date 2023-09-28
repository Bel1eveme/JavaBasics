package books.comparators;

import books.Book;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BookByAuthorTitleCostComparatorTest {

    @Test
    void givenSameTitleAuthorDifferentCost_WhenCompared_ThenResultSmaller() {
        BookByAuthorTitleCostComparator comparator = new BookByAuthorTitleCostComparator();

        int result = comparator.compare(new Book("Confession",
                        "Augustine", 1000, "978-3-16-148410-0"),
                new Book("Confession",
                        "Augustine",1200, "978-3-16-148410-1"));

        Assertions.assertTrue(result < 0);
    }
}