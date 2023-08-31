package lesson_33.comparator_interface;

import java.util.Comparator;

public class PublishingYearComparator implements Comparator<Author> {

    public int compare(Author author1, Author author2){
        return Integer.compare(author1.year, author2.year);
    }


}
