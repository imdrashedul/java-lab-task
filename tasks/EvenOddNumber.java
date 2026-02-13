package tasks;

import java.util.Scanner;
import java.util.NoSuchElementException;

public class EvenOddNumber implements ITasks {

    public void execute(Scanner sc) {
        System.out.print("Please enter a number: ");
        if(sc.hasNextInt()){
            int number = sc.nextInt();
            sc.nextLine();
            
            if(number%2==0) {
                System.out.println("\n\n"+number+" is an even number\n");
            } else {
                System.out.println("\n\n"+number+" is a odd number\n");
            }

        } else {
            sc.nextLine();
            System.out.println("\n\nInvalid Number.\n");
            return;
        }
    }
}