import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class SortedString {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Input file name: ");
        String input = keyboard.next();

        System.out.print("Output file name: ");
        String fileOut = keyboard.next();


        try {
            Scanner fileIn = new Scanner(new FileInputStream(input));
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(0);
        }

        System.out.println("Done.");
    }
}