import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CountWordsImpl {

    public static void main(String[] args) throws FileNotFoundException {
        String fname = args[1];

        int numWords = 0;
        Scanner sc = new Scanner(new File(fname));

        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] words = line.split(" ");

            numWords += words.length;
        }

    }
}
