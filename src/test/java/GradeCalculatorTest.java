import org.junit.Test;

import java.util.Stack;
import static org.junit.Assert.*;

public class GradeCalculatorTest {

    private static final double DELTA = 0.0001;

    @Test
    public void calculateAverage_nothingToCalculate_averageIsZero() {
        Stack<Integer> input = new Stack<>();
        double actual = GradeCalculator.calculateAverage(input);
        assertEquals(0.0, actual, DELTA);
    }

    @Test
    public void calculateAverage_dividesNicely_averageIsExpected() {
        Stack<Integer> input = new Stack<>();
        input.push(5);
        input.push(5);
        input.push(5);
        double actual = GradeCalculator.calculateAverage(input);
        assertEquals(5.0, actual, DELTA);
    }

    @Test
    public void calculateAverage_doesNotDivideNicely_averageIsExpected() {
        Stack<Integer> input = new Stack<>();
        input.push(75);
        input.push(60);
        input.push(86);
        double actual = GradeCalculator.calculateAverage(input);
        assertEquals(73.66666, actual, DELTA);
    }
}