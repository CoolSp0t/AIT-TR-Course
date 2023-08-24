package lesson_28;

public class ConstantsClass implements InterfaceConstans{
    public static void main(String[] args) {
        int[] ints = new int[MAX];

        for (int i = MIN; i <= MAX ; i++) {
            if(i >= MAX)
                System.out.println(ERROR);
            else {
                ints[i] = i;
                System.out.println(ints[i]+ " ");
            }
        }



    }
}
