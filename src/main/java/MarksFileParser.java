import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class MarksFileParser {

    public Stack<Integer> parseFile(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        Stack<Integer> readContents = new Stack<>();

        int numberOfInputs;
        try {
            numberOfInputs = Integer.parseInt(reader.readLine());
        }
        catch(NullPointerException e) {
            throw new IOException("File is empty!");
        }

        for(int i = 0; i < numberOfInputs; i++){
            int value = Integer.parseInt(reader.readLine());
            if (value == 0){
                readContents.pop();
            }
            else {
                readContents.push(value);
            }
        }

        return readContents;
    }
}
