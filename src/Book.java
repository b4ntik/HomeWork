public class Book {
    private final String bookName;
    private final Author author;
    private int publishYear;

    public Book(String bookName, Author authorName, Author authorFamily, int publishYear) {
        this.bookName = bookName;
        this.author = authorName;
        this.publishYear = publishYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublishYear() {
        return this.publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;

    }

    public void displayBookInfo() {
        System.out.println("Название книги " + getBookName());
        System.out.println("Автор " + author.getAuthorName() + " " + author.getAuthorFamily());
        System.out.println("Год выпуска " + getPublishYear());
    }

    public String toString() {
        return "Название книги " + this.bookName + " Автор " + this.author + " Год публикации " + this.publishYear;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Book book = (Book) obj;
        return bookName.equals(book.bookName) && author.getAuthorName().equals(book.author.getAuthorName());
    }

    @Override
    public int hashCode() {
        return 31 * bookName.hashCode() + author.getAuthorName().hashCode();
    }
}






