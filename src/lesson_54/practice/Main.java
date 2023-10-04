package lesson_54.practice;

import java.io.*;
import java.util.*;

public class Main {
    /*
    1. Пусть есть текстовый файл такого вида:
    1
    2
    3
    4
    5
    Нужно написать метод принимающий содержимое этого файла и возвращающий сумму всех значений

    2. Написать метод, принимающий текстовый файл, состоящий из нескольких строчек
    разной длины и возвращающий самую длинную строчку


    3. Пусть есть текстовый файл такого вида:
        Peter,35
        Simon,5
        John,90
        Нужно написать метод, читающий этот файл и возвращающий список людей старше 18 лет,
        отсортированный по возрасту. Известно, что файл не пустой.

        4. Пусть есть класс Person c полями name  и age. Нужно написать метод, записывающий в файл обьекты
      класса Person в виде строк и одновременно выводящий их на экран
     */
    public static void main(String[] args) {
        System.out.println();

        Person person1 = new Person("Peter", 35);
        Person person2 = new Person("Simon", 9);
        Person person3 = new Person("John", 90);

        List<Person> personList = Arrays.asList(person1, person2, person3);
        writeToFile("outputPersons.txt", personList);

    }

    public static int fileIntoSum(String fileName) {
        int result = 0;
        if (fileName != null) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
                String str;
                while ((str = bufferedReader.readLine()) != null) {
                    result = Integer.parseInt(str) + result;
                }

            } catch (
                    IOException e) {
                System.out.println(e.getMessage());
            }
        }


        return result;
    }


    /*
     2. Написать метод, принимающий текстовый файл, состоящий из нескольких строчек
    разной длины и возвращающий самую длинную строчку
     */
    public static String longestLineInFile(String fileName) {
        String longest = "";
        if (fileName != null) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
                String str;
                while ((str = bufferedReader.readLine()) != null) {
                    if (str.length() > longest.length()) {
                        longest = str;
                    }
                }

            } catch (
                    IOException e) {
                System.out.println(e.getMessage());
            }
        }


        return longest;
    }
   /*
   3. Пусть есть текстовый файл такого вида:
        Peter,35
        Simon,5
        John,90
        Нужно написать метод, читающий этот файл и возвращающий список людей старше 18 лет,
        отсортированный по возрасту. Известно, что файл не пустой
    */

    public static List<Person> peopleInFile(String fileName) {
        List<Person> result = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        if (fileName != null) {
            String str;
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
                while ((str = bufferedReader.readLine()) != null) {
                    temp.add(str);
                }

            } catch (
                    IOException e) {
                System.out.println(e.getMessage());
            }
        }
        for (String s : temp) {
            String[] nameAge = s.split(",");
            int age = Integer.parseInt(nameAge[1].trim());
            if (age > 18) {
                result.add(new Person(nameAge[0], age));
            }
        }
        Collections.sort(result);
        return result;
    }

    public static List<Person> composeList(String fileName) {
        List<Person> persons = new ArrayList<>();
        List<String> temp = new ArrayList<>();

        String line;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            while ((line = bufferedReader.readLine()) != null) {
                temp.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String s : temp) {
            String[] nameAge = s.split(",");
            int age = Integer.parseInt(nameAge[1].trim());
            if (age > 18) {
                persons.add(new Person(nameAge[0].trim(), age));
            }
        }
        Collections.sort(persons);
        return persons;
    }






    /*
    4. Пусть есть класс Person c полями name и age. Нужно написать метод, записывающий в файл обьекты
      класса Person в виде строк и одновременно выводящий их на экран
     */

    public static void writeToFile(String fileName, List<Person> persons) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
             BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(System.out))) {
            for (Person person : persons) {
                bw.write("\"" + person.name + "\"" + "," + person.age);
                bw1.write("\"" + person.name + "\"" + "," + person.age);
                bw.newLine();
                bw1.newLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /*
    Пусть есть файл содержащий следующую информацию:
    name, surname(могут повторяться),equipment,price.
    Нужно написать метод, который принимает в качестве параметра имя этого файла и записывает информацию в другой файл в таком виде:
    name surname sumPrice
    Eugene, Black, NoteBook, 1000
    Peter, White, Mac, 800
    Eugene, Black, Keyboard, 25
    John, Green , MousePad, 5
    Peter, White, Mobile, 600

    Eugene Black 1025
    Peter White 1400
    John Green 5
     */
    public static void sumPrice(String inFile, String outFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(inFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outFile))) {
            String line;

            HashMap<String,Integer> result = new HashMap<>();
            while ((line = br.readLine())!= null){
                String[] split = line.split(",");
                String name = split[0].trim().concat(" ").concat(split[1].trim());
                int price = Integer.parseInt(split[3].trim());

//                if(result.containsKey(name)){
//                    result.put(name,price+ result.get(name));
//                }else {
//                    result.put(name,price);
//                }

                int currentValue = result.getOrDefault(name,0);
                int newValue = currentValue+price;
                result.put(name,newValue);
            }
            for (Map.Entry<String,Integer> me : result.entrySet()){
                bw.write(me.getKey()+ " " + me.getValue());
                bw.newLine();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }



    }
}
