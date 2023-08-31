package lesson_33.practice;

import java.util.Comparator;

public class AnimalLastLetterComparator implements Comparator<Animal> {

    public int compare(Animal animal1, Animal animal2){
        return   animal1.name.substring(animal1.name.length()-1).compareTo(animal2.name.substring(animal2.name.length()-1));
    }




}
