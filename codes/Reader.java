/**
 * FileReader Example
 * -> Read all characters from file
 */

import java.io.FileReader;

class Main {
    public static void main(String[] args) {
        try {
            // Open the file
            FileReader fr = new FileReader("./fWrite.txt");
            // Read the file
            int i=0;
            while ((i=fr.read()) != -1) {
                System.out.print((char)i);
            }
            // Close the file
            fr.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}