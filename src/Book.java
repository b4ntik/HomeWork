public class Book {
    private final String bookName;
    private final Author authorName;
    private final Author authorFamily;
    private int publishYear;

    public Book(String bookName, Author authorName, Author authorFamily, int publishYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.authorFamily = authorFamily;
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
        System.out.println("Автор " + authorName.getAuthorName() + " " + authorFamily.getAuthorFamily());
        System.out.println("Год выпуска " + getPublishYear());
    }
}






