public class Book {
    private String name;
    private Author author;
    private int yearPublic;

    public Book(String name, Author author, int yearPublic) {
        this.name = name;
        this.author = author;
        this.yearPublic = yearPublic;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYearPublic() {
        return yearPublic;
    }

    public void setYearPublic(int yearPublic) {
        this.yearPublic = yearPublic;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", yearPublic=" + yearPublic +
                '}';
    }
}


