import java.io.File;
import java.io.IOException;
import java.util.Stack;

public class AugustineDriver {

    public String computeAveragesFromProvidedFile(File file) throws IOException {

        Stack<Integer> parsedGrades = MarksFileParser.parseFile(file);
        double average = GradeCalculator.calculateAverage(parsedGrades);

        return AverageFormatter.getOutputStatement(average);
    }
}
