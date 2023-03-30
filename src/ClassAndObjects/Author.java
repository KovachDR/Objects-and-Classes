package ClassAndObjects;

public class Author {
    private String nameAuthor;

    public Author(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    @Override
    public String toString() {
        return "Author{" +
                "nameAuthor='" + nameAuthor + '\'' +
                '}';
    }

    public String getNameAuthor() {
        return nameAuthor;
    }
}
