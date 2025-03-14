public class Author {
    public String authorName;
    public String authorFamily;

    public Author(String authorName, String authorFamily) {
        this.authorName = authorName;
        this.authorFamily = authorFamily;
    }


    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorFamily() {
        return this.authorFamily;
    }
        public String toString(){
            return " Автор " + this.authorName + " " + this.authorFamily;
    }

}