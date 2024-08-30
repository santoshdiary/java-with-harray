

import java.util.Scanner;

public class Syntax_RunTimeError {
    public static void main(String[] args) {

        // 1) SYNTAX ERROR DEMO -- fault of syntax.
        // int a = 0 // Error: no semicolon!
        // b = 8; // Error: b not declared!

        //2) LOGICAL ERROR DEMO-- unexpected behaviour .
        //Q.  Write a program to print all prime numbers between 1 to 10
        System.out.println(2);
        for (int i=1; i<5; i++){
            System.out.println(2*i+1);
        }
        // here output 9 is not prime N0. which is logical error.

        //3) RUNTIME ERROR --  also called exception in program, occur when user gives that
        // kind of exceptional input which through error in program
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();   // here k=0, is exceptional error.
        System.out.println("Integer part of 1000 divided by k is "+ 1000/k);

    }
}
