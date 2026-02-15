package tasks;

import java.util.Scanner;

public class PrimeNumber implements ITasks {
    public void execute(Scanner sc) {
        System.out.println("\nA prime number is a natural number greater than 1, divisible only by 1 and itself.\nFor example: 2, 3, 5, 7, and 11. These numbers have no other factors besides themselves and one.\n\n");

        System.out.print("Please enter a number: ");
        if(sc.hasNextInt()){
            int number = sc.nextInt();
            if(sc.hasNextLine()) sc.nextLine();
            
            if(this.isPrime(number)) {
                System.out.println("\n\n"+number+" is a prime number\n");
            } else {
                System.out.println("\n\n"+number+" is not a prime number\n");
            }
        } else {
            if(sc.hasNextLine()) sc.nextLine();
            System.out.println("\n\nInvalid Number.\n");
            return;
        }
    }

    private boolean isPrime(int n) {
        if(n <= 1) return false;
        if(n <= 3) return true;

        if(n%2 == 0 || n%3==0) return false;

        for (int i = 5; i*i <= n; i += 6) {
            if(n%i == 0 || n%(i+2) == 0) return false;
        }

        return true;
    }
}