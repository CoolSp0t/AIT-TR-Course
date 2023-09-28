package lesson_53.char_streams_buffed_reader_writer;

import java.io.PrintStream;
import java.io.PrintWriter;

public class OurPrintWriterClass {
    /*
    класс PrintWriter - как правило используется в коммерческих, не учебных проектах в случае если необходимо средств
    Джава вывести информацию в консоль
    Т.к это класс , работающий с символьными потоками

    PrintWriter(OutputStream outputStream, boolean flashingOn)
    outputStream - объект типа OutputStream
    flashingOn - сброс информации в поток при каждом вызове метода например println()

    методы:
    print()
    println()

     */
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out,true);
        int i =100;
        double  d = 123.45;
        pw.println("We use printWriter here");
        pw.println(i);
        pw.println(d);
    }
}
