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
      //  public equals(){
    //}
}






