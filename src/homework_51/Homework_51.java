package homework_51;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Homework_51 {
    /*
    Написать программу, сравнивающую два файла. Программа должна считывать файлы и затем их сравнивать содержимое
    Если найдено отличие, значит файлы не равны и программа выводит на экране соответствующее сообщение
    Если конец обоих файлов достигается одновременно и отличий не найдено - значит файлы одинаковые и программа
    также выводит на экран соответствующее сообщение
    Предварительно создать файлы в корневой директории first.txt, second.txt
     */


    public static void main(String[] args) {
//        try (FileInputStream first = new FileInputStream("first.txt");FileInputStream second = new FileInputStream("second.txt")){
//            int i;
//            int j;
//            while((i = first.read()) != -1 && (j = second.read()) != -1 ){
//                if(i == j){
//                    System.out.println("the files are the same");
//                }else {
//                    System.out.println("the files are not the same");
//                }
//
//            }
//
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }

        try (FileInputStream first = new FileInputStream("first.txt"); FileInputStream second = new FileInputStream("second.txt")) {
            byte[] buffer = new byte[512];
            byte[] buffer2 = new byte[512];
            int counter1;
            int counter2;
            while ((counter1 = first.read(buffer)) != -1 && (counter2 = second.read(buffer2)) != -1) {
                if (counter1 == counter2) {
                    System.out.println("the files are the same");
                }else {
                    System.out.println("the files are not the same");
                }
                if(Arrays.equals(buffer,buffer2)){
                    System.out.println("the files are the same");
                }else {
                    System.out.println("the files are not the same");
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }

}
