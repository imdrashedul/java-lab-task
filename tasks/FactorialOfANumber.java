package tasks;

import java.util.Scanner;
import java.math.BigInteger;

public class FactorialOfANumber implements ITasks {
    public void execute(Scanner sc) {
        System.out.println("\nThe factorial of a non-negative integer is multiplication of all integers smaller than or equal to n.\nFormula for Factorial:\nn! = n * (n-1) * (n-2) * (n-3) * ........ * 1\n\n");

        System.out.print("Please enter a number: ");
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            if(sc.hasNextLine()) sc.nextLine();
            
            System.out.println("\n\n"+n+"! = "+this.factorial(n)+"\n");

        } else {
            if(sc.hasNextLine()) sc.nextLine();
            System.out.println("\n\nInvalid Number.\n");
            return;
        }
    }

    private BigInteger factorial(int n) {
        return n == 0 || n== 1 ? BigInteger.ONE : BigInteger.valueOf(n).multiply(this.factorial(n - 1));
    }
}