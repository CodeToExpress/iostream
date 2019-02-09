/**
 * FileOutputString Example 2
 * -> Write a string (byte array) to file
 */

import java.io.FileOutputStream;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        try {
            // input a string
            System.out.print("Enter a string to write to file: ");
            String str = input.nextLine();

            // Convert it to byte array
            byte[] barr = str.getBytes();

            // Open the file
            FileOutputStream fout = new FileOutputStream("./TestFile.txt");

            // Write to file
            fout.write (barr);
            System.out.println("Task Complete!");

            // Close the file
            fout.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}