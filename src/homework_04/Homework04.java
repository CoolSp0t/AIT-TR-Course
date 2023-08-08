package homework_04;

public class Homework04 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        String myName = "Paul";
        int lengthName = myName.length();
        System.out.println("My name length is " + lengthName + " letters" );
        char a = 'P';
        char b = 'l';
        String str = "Paul";
        char c = str.charAt(0);
        char d = str.charAt(str.length() - 1);

        int codeDecimal = (int) d;
        int codeDecimal2 = (int) c;
        System.out.println(codeDecimal +  " "  + codeDecimal2);

        System.out.println("First letter: " + c + " Last letter: " + d );


        System.out.println("Task 2");

        String string1 = "Java";
        String string2 = "is";
        String string3 = "a";
        String string4 = "powerful";
        String string5 = "language";
        String string6 = String.join(" ", string1, string2, string3, string4, string5 );
        String string7 = string1 + " " + string2 + " " + string3 + " " + string4 + " " + string5;


        System.out.println("Task 2.2");
        System.out.println(string6 + "," + " length: " + string6.length());
        System.out.println(string7 +  "," + " length: " + string7.length());
        String string8 = string6.replace("powerful", "super");
        System.out.println(string8);

        String string9 = "age";
        System.out.println(string6.contains(string9));



        System.out.println("Task 3");
        String stringA = "string";
        String stringB = "code";
        String stringC = "Practice";
        String middleSub = middleChars(stringB);
        String middleSub1 = middleChars(stringA);
        String middleSub2 = middleChars(stringC);
        System.out.println("Средние символы: ");

    }


    public static String middleChars(String str) {
        String result = "";
        int length = str.length();
        int startIndex = length/2 - 1;
        String result1 = str.substring(length/2 - 1, length/2 + 1 );
        System.out.println("Средние символы: " +result1);

        return result;
    }
}
