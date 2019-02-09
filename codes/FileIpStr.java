/**
 * FileInputString Example
 * -> Reading a byte from file
 */

import java.io.FileInputStream;

class Main {
    public static void main(String[] args) {
        try {
            // Open the file
            FileInputStream fin = new FileInputStream("./testing.txt");
            // Read data
            int d = fin.read();
            System.out.println("The first character of the file is: " + (char)d);
            // close the file
            fin.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}