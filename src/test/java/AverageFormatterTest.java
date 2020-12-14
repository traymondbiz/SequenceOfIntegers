import org.junit.Test;

import static org.junit.Assert.*;

public class AverageFormatterTest {

    @Test
    public void getOutputStatement_givenZero_provideExpectedFormat() {
        String expectedResult = "The course average is 0";
        String actualResult = AverageFormatter.getOutputStatement(0);
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void getOutputStatement_givenWholeNumber_provideExpectedFormat() {
        String expectedResult = "The course average is 74";
        String actualResult = AverageFormatter.getOutputStatement(74);
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void getOutputStatement_givenOneDecimalValue_doesNotRound() {
        String expectedResult = "The course average is 13.3";
        String actualResult = AverageFormatter.getOutputStatement(13.3);
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void getOutputStatement_givenMultipleDecimalValuesAboveFive_roundsToOneDecimalUp() {
        String expectedResult = "The course average is 73.7";
        String actualResult = AverageFormatter.getOutputStatement(73.666666);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getOutputStatement_givenMultipleDecimalValuesBelowFive_roundsToOneDecimalDown() {
        String expectedResult = "The course average is 73.6";
        String actualResult = AverageFormatter.getOutputStatement(73.64444);
        assertEquals(expectedResult, actualResult);
    }
}