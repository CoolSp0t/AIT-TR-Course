package lesson_58;

public class Transformer1 {
    public static void main(String[] args) {
        String string  = "aaa BBBB deF vbghR bbb";
        System.out.println(transformString1(string,new WTUpperCase()));
        System.out.println(transformString1(string,new WTLowerCase()));
        System.out.println(transformString1(string,new WTStars()));
    }
    public static String transformString1(String string,WordsTransformer t){
        String[] words = string.split(" ");
        for (int i = 0; i < words.length; i++) {
            if(t.check(words[i])){
                words[i] =t.transform(words[i]);
            }
        }
        return String.join(" ", words);
    }
}
