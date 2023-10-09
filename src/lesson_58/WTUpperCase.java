package lesson_58;

public class WTUpperCase extends WordsTransformer{

    @Override
    public boolean check(String input) {
        return input.length() ==3;
    }

    @Override
    public String transform(String s) {
        return s.toUpperCase();
    }
}
