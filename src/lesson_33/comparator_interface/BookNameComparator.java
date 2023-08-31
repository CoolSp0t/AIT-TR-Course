package lesson_33.comparator_interface;

import java.util.Comparator;

public class BookNameComparator implements Comparator<Author> {


    public int compare(Author author1, Author author2){
        return  author1.bookName.compareTo(author2.bookName);
    }
}
