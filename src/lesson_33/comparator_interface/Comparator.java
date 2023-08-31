package lesson_33.comparator_interface;

import java.util.Arrays;

public class Comparator {
    /*
    Comparator Компаратор интерфейс

    Предоставляет классам возможности дополнительной сортировки по другим, критериям отличным от сортировкии в естественном
    порядке
    Находится в пакете java.util и имеет метод compare()
    public int compare(T o1 , T o2)

    принимает два объекта сравнивает их потому же принципу, что и compareTo
     */

    public static void main(String[] args) {
        Author author1 = new Author("DAuthor", "RBook", 2000);
        Author author2 = new Author("NAuthor", "BBook", 1840);
        Author author3 = new Author("FAuthor", "UBook", 2021);
        Author author4 = new Author("GAuthor", "SBook", 1972);
        Author author5 = new Author("AAuthor", "TBook", 1961);


        Author[] authors = {author1,author2,author3,author4,author5};

        System.out.println("Before sort");
        for (Author author : authors){
            System.out.println(author);
        }

        System.out.println();

        System.out.println("sort by author`s name: ");
        Arrays.sort(authors);
        for (Author author : authors){
            System.out.println(author);
        }

        System.out.println();
        System.out.println("Publishing date");
        Arrays.sort(authors,new PublishingYearComparator());
        for (Author author : authors){
            System.out.println(author);
        }


        System.out.println();
        System.out.println("Book name");
        Arrays.sort(authors, new BookNameComparator());
        for (Author author : authors){
            System.out.println(author);
        }



    }
}
