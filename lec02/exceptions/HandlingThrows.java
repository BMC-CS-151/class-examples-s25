import java.util.Scanner;
import java.io.FileNotFoundException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.io.File;

public class HandlingThrows {

    //TODO 1: Read from the input file argument and print each line
    //      If the file doesn't exist, print an error message and return
    public static void read(String fname) throws FileNotFoundException  {
        Scanner sc = new Scanner(new File(fname)); 

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }

    public static void main(String[] args) {
        //TODO 2: Call read with the first command line argument 
        //try catch 
        read("Foo.java");
    }
}
