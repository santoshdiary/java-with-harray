
 // Creating a "Custom Exception" using Exception class

import java.util.Scanner;

class myException extends Exception{ // here Exception is predefined class.
    @Override
    public String toString() {         // Exception class's method
        return "Number does not contain less than 9";
    }

    @Override
    public String getMessage() {        // Exception class's method
        return "Number does not contain less than 9";
    }
}


public class ExceptionClass {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        a = sc.nextInt();
        if (a<9){
            try{
                throw new myException();

                //throw new ArithmeticException("This is an exception");
                // not only custom but also predefined exception are through  by "throw" keyword.

            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();    // it identifies in which line exception is occurs.

            }
            System.out.println("Yes Finished");
        }
    }
}
