package lesson_53;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws IOException {
        // Стандартные стримы (predefined streams)
        // В классе System определены три объекта стримов - in, out, err
        /*
        эти объекты public, final, static
        System.out - это объект типа output stream и по умолчанию это консоль
        System.in - стандартный ввод, по умолчанию консоль (объект типа InputStream)
        System.err - стандартный вывод для ошибок, по умолчанию консоль

        out и err - это объекты класса PrintStream
        System.in
        int read() throws IOException
        int read(byte[] data) IOException
        int read(byte[] data, int start, int max) IOException

         */

        char ch;
//        System.out.println("press a key and then ENTER");
//        ch = (char) System.in.read();
//        System.out.println("you entered " + ch );

        byte[] data = new byte[10];
        System.out.println("Enter several characters");
        System.in.read(data);
        System.out.println("You entered the following: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print((char) data[i]);
        }

        // System.out - объект класса PrintStream
        System.out.println();

        /*
        некоторые конструкторы класса PrintStream:
        PrintStream(Output output)
        PrintStream(Output output, boolean autoFlush)
        PrintStream(String fileName)
        PrintStream(File fileName)


        методы:
        println()
        print()
        printf()

         */


        String hello = "Hello java!";
        try(PrintStream printStream = new PrintStream(new FileOutputStream( "example.txt"))){
            printStream.println(hello);
        }catch (IOException e ){
            System.out.println(e.getMessage());
        }

        try (PrintStream printStream = new PrintStream("example1.txt")){
            printStream.print("Hello java!");
            printStream.println("Hello java!");
            String word = "print";
            byte[] message = word.getBytes();
            printStream.write(message);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
