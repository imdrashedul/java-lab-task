package tasks;

import java.util.Scanner;


public class ArmstrongNumber implements ITasks {
    public void execute(Scanner sc) {
        System.out.println("\nAn Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.\n\n");

        System.out.print("Please enter a number: ");
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            if(sc.hasNextLine()) sc.nextLine();
            
            if(calculateDigitSum(n)==n) {
                System.out.println("\n\n"+n+" is an armstrong number\n");
            } else {
                System.out.println("\n\n"+n+" is not an armstrong number\n");
            }

        } else {
            if(sc.hasNextLine()) sc.nextLine();
            System.out.println("\n\nInvalid Number.\n");
            return;
        }
    }

    private int calculateDigitSum(int n) {
        int totalDigit = String.valueOf(n).length();
        int digitSum = 0;

        while(n != 0) {
            int lastDigit = n % 10;
            digitSum += Math.pow(lastDigit, totalDigit);
            n /= 10;
        }

        return digitSum;
    }
}