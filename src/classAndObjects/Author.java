package classAndObjects;

import java.util.Objects;

public class Author {
    private String nameAuthor;

    public Author(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    @Override
    public String toString() {
        return "Author - " + nameAuthor;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nameAuthor, author.nameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor);
    }
}
