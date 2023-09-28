package books.comparators;

import books.Book;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BookByTitleComparatorTest {

    @Test
    void givenDifferentTitle_WhenCompared_ThenResultSmaller() {
        BookByTitleComparator comparator = new BookByTitleComparator();

        int result = comparator.compare(new Book("Crime and Punishment",
                                                "Dostoevsky", 1000, "978-3-16-148410-0"),
                                        new Book("Ruslan and Ludmila",
                                                "Pushkin",1000, "978-3-16-148410-1"));

        Assertions.assertTrue(result < 0);
    }
}