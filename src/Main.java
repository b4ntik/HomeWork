public class Main {
    public static void main(String[] args) {

        Author author_1 = new Author("Lev", "Tolstoy");
        Author author_2 = new Author("Dem", "Mihailov");
        Book[] books = new Book[2];
        books[0] = new Book("Voina i Mir", author_1, author_1, 1980);
        books[1] = new Book("Хроники Вальдиры", author_2, author_2, 2024);
        System.out.println(author_1.getAuthorName() + " " + author_1.getAuthorFamily());
        System.out.println(author_2.getAuthorName() + " " + author_2.getAuthorFamily());
        System.out.println((books[0]));
        System.out.println((books[1]));
        System.out.println("Сравнение книг 1 и 2 " + books[0].equals(books[1])); //сравнение книг методом equals
    }
}
