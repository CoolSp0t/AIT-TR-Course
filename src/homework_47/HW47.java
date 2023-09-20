package homework_47;

public class HW47 {
    public static void main(String[] args) {
        try {
            int a =40/0;
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException: divide by zero" );
        }


        try {
            String s =null;
            String m =s.toLowerCase();
       }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        try {
            int[] m = new int[2];
            m[8] = 5;
        }catch (IndexOutOfBoundsException e){
            System.out.println("index 8 is out of bounds in array m with length 2 ");
        }
    }
}
