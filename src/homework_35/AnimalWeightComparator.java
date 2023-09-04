package homework_35;

import java.util.Comparator;

public class AnimalWeightComparator implements Comparator<Animal> {

    public int compare(Animal animal1, Animal animal2){
       return   Integer.compare(animal1.weight,animal2.weight);
    }
}
