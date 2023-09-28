package books;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BookTest {

    @Test
    void givenBook_WhenCloned_ThenEqualObjects() {
        Book book = new Book("Crime and Punishment", "Dostoevsky",
                        1000, "978-3-16-148410-0");
        Book newBook = book.clone();

        Assertions.assertEquals(book, newBook);
    }
}