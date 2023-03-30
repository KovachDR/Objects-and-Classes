package ClassAndObjects;

public class Book {

    private String bookName;
    private Author bookAuthor;
    private int publicationYear;

    public Book(String bookName, Author bookAuthor, int publicationYear) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthor=" + bookAuthor +
                ", publicationYear=" + publicationYear +
                '}';
    }

    public String getBookName() {
        return bookName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
