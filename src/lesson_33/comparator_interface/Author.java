package lesson_33.comparator_interface;

public class Author implements Comparable<Author> {

    String authorName;
    String bookName;
    int year;

    public Author(String authorName, String bookName, int year) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.year = year;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public int getYear() {
        return year;
    }

    public int compareTo(Author author) {
        return authorName.compareTo(author.getAuthorName());
    }


    public String toString() {
        return authorName + " " + bookName + " " + year;
    }

}
