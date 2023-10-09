package lesson_58;

public class ToLowerCaseChecker  implements  WordChecker{

    @Override
    public boolean checkWord(String word) {
        return word.length() == 4;
    }

    @Override
    public String transformWord(String word) {
        return word.toLowerCase();
    }
}
