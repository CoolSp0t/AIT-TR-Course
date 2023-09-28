package lesson_53.char_streams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    // ввод-вывод текстовый информации
    /*
    Reader, Writer - абстрактные классы, лежащий в основе иерархии классов работающих с вводом-выводом символьной информации

    Reader - отвечает за чтение
    int read() - возвращает текущий символ потока(целочисленное его представление)
                 и -1 если символов нет

    int read(char[] data) - считывает в массив data символы с потока и возвращает количество
                            считанных символов. В конце возвращают -1

    int read(char[] data, int index, int number)

    close()
    skip(long count) -  пропускает количество символов count

    Writer - базовый класс всех символьных потоков работающих на вывод

    методы:

    void write(int ch)
    void write(char[] chars)
    abstract  void  write (char[] chars, int index, int number)
    close()
    append(char ch) - в конец выходного потока добавляет символ ch
    append(CharSequence chars) - добавляет набор символов chars





    Запись в файл - класс FileWriter
    Конструкторы:
    FileWriter(String fileName)
    FileWriter(String fileName, boolean append)
    FileWriter(File fileName)
    FileWriter(File fileName,boolean append)

     */

    public static void main(String[] args) {
       try( FileWriter writer = new FileWriter("exampleChar.txt",true)){
           String word = " hello everybody";
           writer.write(word);
           writer.append('\n');
           writer.append('J');
           writer.append('a');
           writer.append('v');
           writer.append('a');
       }catch (IOException e){
           System.out.println(e.getMessage());
       }


       /*
       класс FileReader - чтение текстовых файлов
       конструкторы:
       FileReader(String fileName)
       FileReader(File file)
        */

        try(FileReader reader = new FileReader("exampleChar.txt")){
            int ch;
            while((ch = reader.read())!=-1){
                System.out.print((char) ch);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }



        // with array
        System.out.println("with array");
        try(FileReader reader = new FileReader("exampleChar.txt")){
            char[ ] data = new char[512];
            int counter;
            while((counter = reader.read(data))> 0){
                if(counter < 512){
                    data = Arrays.copyOf(data,counter);
                }
                System.out.print(data);

            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }

}
