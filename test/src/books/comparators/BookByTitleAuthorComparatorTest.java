package books.comparators;

import books.Book;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BookByTitleAuthorComparatorTest {

    @Test
    void givenSameTitleDifferentAuthor_WhenCompared_ThenResultBigger() {
        BookByTitleAuthorComparator comparator = new BookByTitleAuthorComparator();

        int result = comparator.compare(new Book("Confession",
                        "Tolstoy", 1000, "978-3-16-148410-0"),
                new Book("Confession",
                        "Augustine",1000, "978-3-16-148410-1"));

        Assertions.assertTrue(result > 0);
    }
}