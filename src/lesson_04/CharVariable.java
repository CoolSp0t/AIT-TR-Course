package lesson_04;

public class CharVariable {
    public static void main(String[] args) {

        char a = 'A'; // переменная будет содержать англ букву А
        char b = 0x41; // переменная будет содержаьб англ букву А, т.е 41 16-сист соответствует коду символа А
        char c = 65 ; // переменная будет содержаьб англ букву А, код 65 соответствует символу  А
        b = 0x0041; // переменная будет содержаьб англ букву А, т.е 41 16-сист соответствует коду символа А
        char d = '\u0041';
        char e = '\u2019';



        System.out.println(a + " b: " + b +  " c: " + c + " d: " + d);
        System.out.println(e);


        char ch = 'A';
        ch++; // ch = ch + 1
        System.out.println(ch);


        ch = 97;
        System.out.println(ch);
        ch += 2;
        System.out.println(ch);

        int x = 1;
        int y = 5;
//        x = x + y;
        x += y; // x = x + y
//        *= , /=, -=, %=
        System.out.println(x);
//        x %=  //  x = x % y

        System.out.println(x);

    }
}
