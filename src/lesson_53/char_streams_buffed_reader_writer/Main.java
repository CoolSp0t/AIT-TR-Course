package lesson_53.char_streams_buffed_reader_writer;

import java.io.*;

public class Main {
    /*
    BufferedReader
    BufferedWriter
    - классы, используемые для буферизации символьных потоков

    BufferedWriter - класс, записывающий символы в поток, буфферизуя их предварительно.

    Конструкторы
    BufferedWriter(Writer out)
    BufferedWriter(Writer out, int size)
     */
    public static void main(String[] args) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bufferedEx.txt"))){
            String sentence = "Hello java and everyone!";
            bufferedWriter.write(sentence);
            bufferedWriter.newLine();


        }catch (IOException e){
            System.out.println(e.getMessage());
        }


        // BufferedReader - чтение текста с буферизацией
        /*
        BufferedReader(Reader in)
        BufferedReader(Reader in, int size)

         */
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("bufferedEx.txt"))){
            int ch;
            while ((ch = bufferedReader.read())!= -1){
                System.out.print((char) ch);
            }
        }catch (IOException e ){
            System.out.println(e.getMessage());
        }

        // метод readLine() - собственный метод класса BufferedReader позволяет считывать
        // информацию построчно
        System.out.println();
        System.out.println("BufferedReader with readLine");

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("bufferedEx.txt"))){
            String str;
            while ((str = bufferedReader.readLine()) != null){
                System.out.println(str);
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        // чтение с консоли с помощью BufferedReader и запись этой информации в файл с помощью BufferedWriter

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("fromConsole.txt"))){
             String line;
             while (!(line = bufferedReader.readLine()).equalsIgnoreCase("EXIT")){
                 bufferedWriter.write(line);
                 bufferedWriter.newLine();
                 bufferedWriter.flush();
             }
        }catch (IOException e ){
            System.out.println(e.getMessage());
        }




    }

}
