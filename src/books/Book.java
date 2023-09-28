package books;

public class Book implements Cloneable, Comparable<Book> {

    private final String title;

    private final String author;

    private final int price;

    private final String isbn;

    private static int edition;

    public Book(String title, String author, int price, String isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public String getTitle() { return title; }

    public String getAuthor() { return author; }

    public int getPrice() { return price; }

    public String getIsbn() { return isbn; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null) return false;

        if (this.getClass() != obj.getClass())
            return false;

        Book book = (Book) obj;
        return title.equals(book.title)
                && (author.equals(book.author))
                && (price == book.price);
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = 31 * result + title.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString(){
        return String.format("Book \"%s\" by %s costs %d", title, author, price);
    }

    @Override
    public Book clone(){
        try {
            return (Book)super.clone();
        } catch (CloneNotSupportedException exception){
            throw new AssertionError(exception);
        }
    }

    @Override
    public int compareTo(Book o) {
        return isbn.compareTo(o.isbn);
    }
}
