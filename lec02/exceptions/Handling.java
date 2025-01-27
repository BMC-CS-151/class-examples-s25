import java.util.Scanner;
import java.io.FileNotFoundException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.io.File;

public class Handling {

    //TODO 1: Read from the input file argument and print each line
    //      If the file doesn't exist, print an error message and return
    public static void read(String fname)  {
        Scanner sc;
        try {
            //code which might throw an exception
            sc = new Scanner(new File(fname)); 
        } catch (FileNotFoundException e) {
            //code to execute if an exception is thrown
            System.out.println("File does not exist");
            return;
        } 

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }

    public static void main(String[] args) {
        //TODO 2: Call read with the first command line argument 
        if (args.length == 0) {
            System.out.println("USAGE: send a fname as a cmd line argument");
            return;
        }
        read(args[0]);
    }
}
