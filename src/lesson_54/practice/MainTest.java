package lesson_54.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testSum(){
        assertEquals(15,Main.fileIntoSum("practice.txt"));
    }


    @Test
    public void testLongest(){
        assertEquals("bbbbbbbbb",Main.longestLineInFile("practice.txt"));
    }


}