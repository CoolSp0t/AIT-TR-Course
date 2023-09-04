package homework_35;

import java.util.Comparator;

public class AnimalNameComparator implements Comparator<Animal> {

    public int compare(Animal animal1, Animal animal2){
        return animal1.name.compareTo(animal2.name);
    }

}
