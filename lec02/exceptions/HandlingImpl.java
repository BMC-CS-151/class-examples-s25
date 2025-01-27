import java.util.Scanner;
import java.io.FileNotFoundException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.io.File;

public class HandlingImpl {

    public static void read(String fname) {

        Scanner input;
        try {
            input = new Scanner(new File(fname));
        } catch (FileNotFoundException e) {
            System.out.println("no file named " + fname);
            return;
        } 

        String line;
        while (input.hasNextLine()) { 
            line = input.nextLine();
            System.out.println(line);
        }

        input.close();
    }

    public static void main(String[] args) {
        try {
            read(args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index AOB");
            return;
        }
    }
}
