public class Book {
    public String bookName;
    public Author authorName;
    public Author authorFamily;
    public int publishYear;

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

    public int setPublishYear() {
        return this.publishYear;
    }

    public void displayBookInfo() {
        System.out.println("Название книги " + bookName);
        System.out.println("Автор " + authorName.getAuthorName() + " " + authorFamily.getAuthorFamily());
    }
}






