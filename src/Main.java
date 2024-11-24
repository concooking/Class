public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Robert", "Martin");

        Book book1 = new Book("Чистый код", author1,2008);

        Author author2 = new Author("Kathy", "Sierra");

        Book book2 = new Book("Изучаем JAVA", author2, 2003);

        System.out.println(author1.equals(author2));

    }
}