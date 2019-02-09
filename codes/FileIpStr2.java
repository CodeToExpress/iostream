/**
 * FileInputString Example 2
 * -> Read all characters from file
 */

import java.io.FileInputStream;

class Main {
    public static void main(String[] args) {
        try {
            // Open the file
            FileInputStream fin = new FileInputStream("./TestFile.txt");
            // Read the file
            int i=0;
            while ((i=fin.read()) != -1) {
                System.out.print((char)i);
            }
            // Close the file
            fin.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}