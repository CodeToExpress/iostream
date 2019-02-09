/**
 * FileOutputString Example
 * -> Write a byte to file
 */

import java.io.FileOutputStream;

class Main {
    public static void main(String[] args) {
        try {
            // Open the file
            FileOutputStream fout = new FileOutputStream ("./TestFile.txt");
            // Write data
            fout.write (65);
            // Close the file
            fout.close();
            System.out.println("Task Complete!");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}