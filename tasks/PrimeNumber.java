package tasks;

import java.util.Scanner;

public class PrimeNumber implements ITasks {
    public void execute(Scanner sc) {
        System.out.print("Please enter a number: ");
        if(sc.hasNextInt()){
            int number = sc.nextInt();
            sc.nextLine();
            
            if(this.isPrime(number)) {
                System.out.println("\n\n"+number+" is a prime number\n");
            } else {
                System.out.println("\n\n"+number+" is not a prime number\n");
            }
        } else {
            sc.nextLine();
            System.out.println("\n\nInvalid Number.\n");
            return;
        }
    }

    private boolean isPrime(int number) {
        if(number <= 1) return false;

        for(int i = 2; i * i <= number; i++) {
            if(number % i == 0) return false;
        }

        return true;
    }
}