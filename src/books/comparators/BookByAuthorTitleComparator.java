package books.comparators;

import books.Book;

import java.util.Comparator;

public class BookByAuthorTitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int result = o1.getAuthor().compareTo(o2.getAuthor());

        return result == 0 ? o1.getTitle().compareTo(o2.getTitle()) : result;
    }
}
