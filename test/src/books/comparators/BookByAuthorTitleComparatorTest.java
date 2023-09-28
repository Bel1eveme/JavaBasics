package books.comparators;

import books.Book;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BookByAuthorTitleComparatorTest {

    @Test
    void givenSameAuthorDifferentTitle_WhenCompared_ThenResultSmaller() {
        BookByAuthorTitleComparator comparator = new BookByAuthorTitleComparator();

        int result = comparator.compare(new Book("Crime and Punishment",
                        "Dostoevsky", 1000, "978-3-16-148410-0"),
                new Book("Idiot",
                        "Dostoevsky",1000, "978-3-16-148410-1"));

        Assertions.assertTrue(result < 0);
    }
}