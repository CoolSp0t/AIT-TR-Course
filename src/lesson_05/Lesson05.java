package lesson_05;

public class Lesson05 {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        boolean bool = true;
        boolean bool1 = false;
        boolean b1 = (a == b);

        System.out.println(b1); // false
        System.out.println(a == b); // false

        boolean b2 = a != b;
        System.out.println(b2); // true
        System.out.println(b != 10); // false

        boolean b3 = a > b;
        boolean b4 = a < b;
        boolean b5 = b > 10;
        System.out.println("b3 " + b3 + " b4 " + b4 + " b5 " + b5);

        boolean b6 = a >= b;
        boolean b7 = a <= b;
        boolean b8 = b >= 10;
        System.out.println("b6 " + b6 + " b7 " + b7 + " b8 " + b8);

        boolean bol = !(2 > 5);
        System.out.println(bol);
        System.out.println(!true);
        boolean var = 3 != 4; // true
        var = !(3 != 4); // false
        System.out.println("var " + var);
        System.out.println(!(3 != 4));

        System.out.println();
        System.out.println("-----------------------");

//        boolean var1 = "Рим столица Италии" &(и) "Берлин столица Германии";
        // Логическое И
        boolean var1 = true & true;
        System.out.println(var1);
        var1 = (2 < 5) & (10 != 11);
        System.out.println(var1);
        var1 = (2 < 5 ) & (10 == 11);
//        var1 = true & false;
        System.out.println(var1);

        System.out.println();
        System.out.println("-----------------------");
        // логическое ИЛИ
        //        boolean var1 = "Рим столица Италии" |(ИЛИ) "Берлин столица Бразилии"; достаточно только true чтобы вышло true
        boolean var2 = true | false;
        System.out.println("var2 " + var2);
        var2 = (2 < 5) | (10 == 11);
        System.out.println(var2);

        System.out.println();
        System.out.println("-----------------------");

        boolean var3 = true ^ false;
        System.out.println("var3 " + var3);
        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(false ^ true);

        //boolean var1 = "Рим столица Италии" &&(и) "Берлин столица Германии";
        // Логическое сокращенное И
        boolean var11 = true && true;
        System.out.println(var11);
        var11 = (2 < 5) && (10 != 11);
        System.out.println(var1);
        var11 = (2 < 5 ) && (10 == 11);
//        var1 = true & false;
        System.out.println(var11);
        var11 = false && true;
        System.out.println(var11);


        int x = 0;
        int y = 5;
        boolean b9 = (x != 0) && (y / x < 24);
        System.out.println("b9 +" + b9);

        // логичское сокращенное ИЛИ
        boolean b10 = true || false;
        System.out.println("b10 " + b10);


        /*
        !
        &
        ^
        |
        &&
        ||
         */
        System.out.println("--------------");
        System.out.println(true ^ true & false);
        System.out.println(true ^ false);
        System.out.println(true);


        System.out.println("--------------");
        System.out.println(true ^ true && false);
        System.out.println(false && false);
        System.out.println(false);

        System.out.println("--------------");
        boolean aa = true;
        boolean bb = false;
        int c = 25;
        int qq = 2;
        System.out.println((aa | bb) | (c < 100) & !(true) ^ (qq == 5));
        System.out.println((aa | bb) | (c < 100) & false ^ (qq == 5));
        System.out.println((aa | bb) |  false ^ (qq == 5));
        System.out.println((aa | bb) |  false);
        System.out.println((true) |  false);
        System.out.println(true);

        System.out.println("--------------");
        System.out.println(true || false ^ true & !true);
        System.out.println(true || false ^ true & false);
        System.out.println(true || false ^ false);
        System.out.println(true || false);
        System.out.println(true);













    }
}
