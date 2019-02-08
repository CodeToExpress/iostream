/**
 * iostream workshop code #1 - Exception Handling
 * -> LBYL vs EAFP (ArithmeticException)
 */

import javax.lang.model.util.ElementScanner6;

class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        System.out.println(divideEAFP(x, y));
        System.out.println(divideLBYL(x, y));
        System.out.println(divide(x, y));
    }

    private static int divideLBYL (int x, int y) {
        if (y!=0)
            return x/y;
        else 
            return -1;
    }

    private static int divideEAFP (int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    private static int divide (int x, int y) {
        return x/y;
    }
}