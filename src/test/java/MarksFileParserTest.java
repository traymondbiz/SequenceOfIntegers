import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Stack;

import static org.junit.Assert.*;

public class MarksFileParserTest {

    private static final String MARKS_TXT = "C:\\Users\\RaylazorIII\\IdeaProjects\\SequenceOfIntegers\\src\\test\\resources\\marks.txt";
    private static final String MARKS_2_TXT = "C:\\Users\\RaylazorIII\\IdeaProjects\\SequenceOfIntegers\\src\\test\\resources\\marks2.txt";

    @Test
    public void parseFile_fileCancelsItselfOut_returnValueIsEmptyStack() throws IOException {
        MarksFileParser subject = new MarksFileParser();
        File marksTxt = new File(MARKS_TXT);

        Stack<Integer> actual = subject.parseFile(marksTxt);
        assertTrue(actual.empty());
    }

    @Test
    public void parseFile_fileHasThreeLegitimateValues_returnValuesInStack() throws IOException {
        MarksFileParser subject = new MarksFileParser();
        File marks2Txt = new File(MARKS_2_TXT);

        Stack<Integer> actual = subject.parseFile(marks2Txt);
        assertEquals(Integer.valueOf(86), actual.pop());
        assertEquals(Integer.valueOf(60), actual.pop());
        assertEquals(Integer.valueOf(75), actual.pop());
    }
}