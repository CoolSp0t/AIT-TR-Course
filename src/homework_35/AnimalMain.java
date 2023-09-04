package homework_35;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class AnimalMain {
   /*
   Создать класс Animal c полями name , weight, color
   Используя компораторы вывести на экран список животных, упорядоченный по:
   1. названию
   2. весу
   3. список названий  животных, по возрастианию последней буквы имени

   Wolf, Bear, Fox , Elephant, Anaconda


   для 1 пунтка:
   Anaconda, 500, yellow
   ...


   для 3 пунтка:
   Anaconda
   Wolf
   Bear
   Elephant
   Fox


   Протестировать правильность работы компораторов
    */

    public static void main(String[] args) {
        Animal animal1 = new Animal("Wolf", 100, "White");
        Animal animal2 = new Animal("Bear", 300, "Brown");
        Animal animal3 = new Animal("Fox", 150, "Red");
        Animal animal4 = new Animal("Elephant", 1000, "Grey");
        Animal animal5 = new Animal("Anaconda", 500, "Yellow");


        Animal[] animals = {animal1,animal2,animal3,animal4,animal5};

        System.out.println("Before sort");
        for (Animal animal : animals){
            System.out.println(animal);
        }

        System.out.println();
        System.out.println("Sort by name");
        Arrays.sort(animals,new AnimalNameComparator());
        for (Animal animal : animals){
            System.out.println(animal);
        }

        System.out.println();
        System.out.println("Sort by weight");
        Arrays.sort(animals, new AnimalWeightComparator());
        for (Animal animal : animals){
            System.out.println(animal);
        }

        System.out.println();
        System.out.println("Sort by last letter");
        Arrays.sort(animals, new AnimalLastLetterComparator());
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].name);
        }


        System.out.println("----------------------------lambda comparator---------------------");
        System.out.println();
        System.out.println("Sort by name");
        Comparator<Animal> animalNameComparator = (a1 , a2) ->  {
            return  a1.name.compareTo(a2.name);
        };
        Arrays.sort(animals, animalNameComparator);
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].toString());
        }

        System.out.println();
        System.out.println("Sort by weight");
        Comparator<Animal> animalWeightComparator = (a1 , a2) ->  {
            return  Integer.compare(a1.weight, a2.weight);
        };
        Arrays.sort(animals, animalWeightComparator);
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].toString());
        }
        System.out.println();
        System.out.println("Sort by last letter");
        Comparator<Animal> animalLastLetterComparator = (a1 , a2) -> {
            return a1.name.substring(a1.name.length()-1).compareTo(a2.name.substring(a2.name.length()-1));
        };
        Arrays.sort(animals, animalLastLetterComparator);
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].toString());
        }

    }





}
