package books.comparators;

import books.Book;

import java.util.Comparator;

public class BookByAuthorTitleCostComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int authorResult = o1.getAuthor().compareTo(o2.getAuthor());

        if (authorResult != 0)
            return authorResult;

        int titleResult;
        titleResult = o1.getTitle().compareTo(o2.getTitle());
        if (titleResult != 0)
            return  titleResult;

        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}