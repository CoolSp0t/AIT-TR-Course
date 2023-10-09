package lesson_58;

public class WTStars extends WordsTransformer{
    @Override
    public boolean check(String input) {
        return input.length() ==5;
    }

    @Override
    public String transform(String s) {
        return "*****";
    }
}
