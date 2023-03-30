package ClassAndObjects;

public class Main {
    public static void main(String[] args) {
        Author sKing = new Author("Steven King");
        Author exupery = new Author("Antoine Saint-Exupery");
        Book darkTower1 = new Book("The Gunslinger",sKing,1982);
        Book littlePrince = new Book("The little prince",exupery,1943);
        darkTower1.setPublicationYear(1983);
        System.out.println(darkTower1);
        System.out.println(littlePrince);

    }
}
