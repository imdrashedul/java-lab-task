package tasks;

import java.util.Scanner;

public class FibonacciSeries implements ITasks {
    public void execute(Scanner sc) {
        System.out.println("\nThe Fibonacci series is the sequence where each number is the sum of the previous two numbers of the sequence.\nThe first two numbers of the Fibonacci series are 0 and 1 and are used to generate the Fibonacci series.\n\n");

        System.out.print("Please enter number of terms: ");
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            if(sc.hasNextLine()) sc.nextLine();
            
            int fn2 = 0, fn1 = 1;
            
            System.out.println("\n\bFibonacci series F(0) to F("+n+"):");
            for(int i = 0; i <= n; i++) {
                System.out.print(fn2 + " ");

                int fn = fn2 + fn1;
                fn2 = fn1;
                fn1 = fn;
            }

            System.out.println("\n");

        } else {
            if(sc.hasNextLine()) sc.nextLine();
            System.out.println("\n\nInvalid Terms Number.\n");
            return;
        }
    }
}