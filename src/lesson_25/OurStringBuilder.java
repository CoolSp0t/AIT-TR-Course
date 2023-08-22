package lesson_25;

public class OurStringBuilder {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(str.substring(2));
        System.out.println(str);
        str = "frtu";

        //StringBuilder - используется для создания изменяемых строк
        // конструкторы:
        /*
        StringBuilder() - пустой стрингбилдер
        StringBuilder(String) -  стрингбилдер со строкой String
        StringBuilder(int length) - пустой стрингбилдер размера length

         */

        // метод append(String s) - добавляет строку к имеющейся , также может добавлять числa , float, double etc

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.append(" Java");
        System.out.println(sb);

        // insert() - вставляет строку в исходную начиная с указанной позиции
        StringBuilder sbInsert = new StringBuilder("Hello");
        sbInsert.insert(1, "World");
        System.out.println(sbInsert);

        // replace() - заменяет исходную строку с указнной позиции заканчивая указанной позицией

        StringBuilder sbReplace = new StringBuilder("Hello");
        sbReplace.replace(1,3,"Java");
        System.out.println(sbReplace);

        // delete() - удаляет строку между указанными индексами

        StringBuilder sbDelete = new StringBuilder("Hello");
        sbDelete.delete(1,3);
        System.out.println(sbDelete);

        // reverse() - разворачивает строку
        StringBuilder sbReverse = new StringBuilder("Hello");
        sbReverse.reverse();
        System.out.println(sbReverse);

















    }
}
