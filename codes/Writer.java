/**
 * FileWriter Example 
 * -> Write a string to file
 */

import java.io.FileWriter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        try {
            // Open the file
            FileWriter fw = new FileWriter("./fWrite.txt");
            // Read string from user
            System.out.print("Enter a string: ");
            String str = input.nextLine();
            // Write string
            fw.write(str);
            System.out.println("Task Completed!");
            // Close the file
            fw.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
