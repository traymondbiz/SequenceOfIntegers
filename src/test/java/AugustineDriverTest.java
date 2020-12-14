import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class AugustineDriverTest {

    private static final String MARKS_TXT = "C:\\Users\\RaylazorIII\\IdeaProjects\\SequenceOfIntegers\\src\\test\\resources\\marks.txt";
    private static final String MARKS_2_TXT = "C:\\Users\\RaylazorIII\\IdeaProjects\\SequenceOfIntegers\\src\\test\\resources\\marks2.txt";

    @Test
    public void computeAveragesFromProvidedFile_fileCancelsSelfOut_averageIsZero() throws IOException {
        File file = new File(MARKS_TXT);
        AugustineDriver augustineDriver = new AugustineDriver();
        String expected = "The course average is 0";
        String actual = augustineDriver.computeAveragesFromProvidedFile(file);
        assertEquals(expected, actual);
    }

    @Test
    public void computeAveragesFromProvidedFile_validFile_outputIsCorrectlyFormatted() throws IOException {
        File file = new File(MARKS_2_TXT);
        AugustineDriver augustineDriver = new AugustineDriver();
        String expected = "The course average is 73.7";
        String actual = augustineDriver.computeAveragesFromProvidedFile(file);
        assertEquals(expected, actual);
    }
}