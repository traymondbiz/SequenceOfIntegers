import java.util.Stack;

public class GradeCalculator {

    public static double calculateAverage(Stack<Integer> grades){
        int numberOfGrades = grades.size();
        if (numberOfGrades == 0){
            return 0;
        }

        int sum = getSum(grades);
        return (double) sum / numberOfGrades;
    }

    private static int getSum(Stack<Integer> grades) {
        int runningTotal = 0;
        while (!grades.empty()){
            runningTotal += grades.pop();
        }
        return runningTotal;
    }
}
