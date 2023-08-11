package homework_18;

public class Homework18 {
    public static void main(String[] args) {
        RubberArray ra = new RubberArray();
        ra.printArray();
        ra.add(10, 15, -20, 40, 50, 60, 70, 80, 90, 100);
        ra.printArray();
        System.out.println("Сейчас в массиве " + ra.size() + " элементов");

        int value = 40;
        System.out.println("Число: " + value + " находится под индексом: " + ra.returnIndexOfValue(value));
        int index = 5;
        System.out.println("Под индексом: " + index + " находится число: " + ra.returnValueByIndex(index));

        ra.printArray();
        ra.deleteByValue(15);
        ra.printArray();

        ra.swapByIndex(5, 150);
        ra.printArray();

        ra.swapOldValueToNewValue(100, 89);
        ra.printArray();

        int[] ints = { 50, 60, 70, 80, 90};
        RubberArray ra1 = new RubberArray(ints);
        ra1.printArray();

        ints[0] = 1000;
        ra1.printArray();

        ra.add(3, 10 ,3);
        ra.printArray();
        ra.deleteAllByValue(3);
        ra.printArray();
    }
}
