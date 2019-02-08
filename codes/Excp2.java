/**
 * iostream workshop code #2 - Exception Handling
 * -> LBYL vs EAFP (InputMisMatchException0)
 */

import java.util.*;

class Main {
    public static void main(String[] args) {
        // int x = getIntLBYL();
        int x = getIntEAFP();
        System.out.println("x is: " + x);
    }

    private static  int getInt () {
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter an integer: ");
        return input.nextInt();
    }

    private static int getIntLBYL () {
        Scanner input = new Scanner (System.in);
        boolean isValid = true;
        System.out.print("Please enter an integer: ");
        String n = input.next();

        for (int i=0; i<n.length(); i++) {
            if (!Character.isDigit (n.charAt(i))) {
                isValid = false;
                break;
            }
        }

        if (isValid)
            return Integer.parseInt(n);
        return -1;
    }

    private static int getIntEAFP () {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter an integer: ");
        try {
            return input.nextInt();
        } catch (InputMismatchException e) {
            return -1;
        }
    }
}