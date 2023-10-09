package lesson_58;

public class WTLowerCase extends WordsTransformer {
    @Override
    public boolean check(String input) {
        return input.length() ==4;
    }

    @Override
    public String transform(String s) {
        return s.toLowerCase();
    }
}
