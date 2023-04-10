package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static int quotient (int x, int y)
            throws ArithmeticException
    {
        return x/y;
    }
    public static void main(String[] args) {
        // write your code here
        int x, y;

        boolean continueLoop = true;
        Scanner input;
        do {
            input = null;
            try {
                System.out.println("Please provide two values to divide");
                input = new Scanner(System.in);

                x = input.nextInt();
                if (x == 50) {
                    throw new FiftyException();
                }
                y = input.nextInt();

                int result = quotient(x, y);

                System.out.println("Result is: " + result);

                assert (y!=0):"Division by 0 will be a problem";

                continueLoop = false;
            }
            catch (InputMismatchException e) {
                System.err.println("We are excepting an integer" + e);
                input.nextLine();
            }
            catch (FiftyException e)
            {
                System.err.println("I hate 50!" +e);
            }
            catch (ArithmeticException e) {
                System.err.println("Division by zero is big problem! Fix your inputs!" +e);
                e.printStackTrace();
            }
            catch (Exception e)
            {
                System.err.println("Something went wrong!"+e);
            }
            finally // This will run for sure
            {
                input = null;
                //Close the file
                //Close database connection
                //Any remote connection
            }
        } while (continueLoop);
    }
}
