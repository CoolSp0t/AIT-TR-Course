package lesson_33.practice;

import java.util.Comparator;

public class AnimalLastLetterComparator implements Comparator<Animal> {

    public int compare(Animal animal1, Animal animal2){
        return   animal1.name.substring(animal1.name.length()-1).compareTo(animal2.name.substring(animal2.name.length()-1));
    }

    public int compare2(Animal an1, Animal an2){
        String animalName1 = an1.getName();
        String animalName2 = an2.getName();
        return  animalName1.charAt(animalName1.length()-1) - animalName2.charAt(animalName2.length()-1);
    }


}
