public class AverageFormatter {

    private static final String FORMATTED_TEXT = "The course average is ";

    public static String getOutputStatement(double average){
        return FORMATTED_TEXT + String.format("%.1f", average);
    }

    public static String getOutputStatement(int average){
        return FORMATTED_TEXT + average;
    }
}
