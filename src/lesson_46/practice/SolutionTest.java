package lesson_46.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();
    @Test
    public void areCorrectBrackets(){
        // {}([]{()})
        char[] chars = {'{','}','(','[',']','{','(',')','}',')'};
        assertTrue(solution.areBracketsCorrect(chars));
    }
    @Test
    public void areCorrectBrackets_False(){
        char[] chars = {'{','{','(',')','}',')'};
        assertFalse(solution.areBracketsCorrect(chars));
    }
    @Test
    public void areCorrectBrackets_oneBracket(){
        char[] chars = {'('};
        assertFalse(solution.areBracketsCorrect(chars));
    }

}