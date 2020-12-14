public class AverageFormatter {

    private static final String FORMATTED_TEXT = "The course average is ";

    public static String getOutputStatement(double average){

        double roundedOffDouble = Double.parseDouble(String.format("%.1f", average));

        if (hasDecimalValues(roundedOffDouble)){
            return FORMATTED_TEXT + roundedOffDouble;
        }
        return FORMATTED_TEXT + String.format("%d", (int) average);
    }

    private static boolean hasDecimalValues(double average) {
        String[] averageSplitByDecimal = Double.toString(average).split("\\.");
        return Integer.parseInt(averageSplitByDecimal[1]) != 0;
    }
}
