package tasks;

import java.util.Scanner;

public class GoldbachsConjecture implements ITasks {
    public void execute(Scanner sc) {
        System.out.println("\nGoldbach's conjecture is one of the oldest and most well-known unsolved problems in number theory, stating that every even integer greater than 2 is the sum of two prime numbers.\n\n");

        System.out.print("Please enter an even integer greater than 2: ");
        if(sc.hasNextInt()){
            int inp = sc.nextInt();
            if(sc.hasNextLine()) sc.nextLine();

            if(inp <= 2) {
                System.out.println("\n\n"+inp+" is not greater than 2.\n");
                return;
            }

            if(inp%2!=0) {
                System.out.println("\n\n"+inp+" is not an even number.\n");
                return;
            }

            boolean flag = false;

            System.out.println("\n\nPrime pairs are: ");
            for(int i = 0; i <= inp / 2; i++) {
                if(isPrime(i) && isPrime(inp - i)) {
                    System.out.println(inp +" = "+ i +" + "+ (inp - i));
                    flag = true;
                }
            }

            if(!flag) {
                System.out.println("No pairs found.");
            }
            
            System.out.println("\n");
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