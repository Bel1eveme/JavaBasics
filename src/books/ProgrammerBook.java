package books;

public class ProgrammerBook extends Book{

    private final String language;

    private final int level;

    public ProgrammerBook(String title, String author, int price,
                          String isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;

        ProgrammerBook book = (ProgrammerBook) obj;
        return language.equals(book.language)
                && (level == book.level);
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = 31 * result + super.hashCode();
        result = 31 * result + language.hashCode();
        result = 31 * result + level;

        return result;
    }

    @Override
    public String toString(){
        return String.format("%s in %s language with %d level", super.toString(), language, level);
    }
}
