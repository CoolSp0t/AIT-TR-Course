package lesson_58;

public class Transformer2 {
    public static void main(String[] args) {
        String s = "aaa BBBB deF vbghR bbb";
        Transformer2 t = new Transformer2();
        WordChecker w2= new ToLowerCaseChecker();
        System.out.println(t.transformWithInterface(s, w2));
    }

    public String transformWithInterface(String sentence, WordChecker w){
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if(w.checkWord(words[i])){
                w.transformWord(words[i]);
            }
        }
        return String.join(" ", words);
    }
}
