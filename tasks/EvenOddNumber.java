package tasks;

import java.util.Scanner;

public class EvenOddNumber implements ITasks {

    public void execute(Scanner sc) {
        System.out.println("\nAn even number is a number which has a remainder of 0 upon division by 2, while an odd number is a number which has a remainder of 1 upon division by 2.\n\n");

        System.out.print("Please enter a number: ");
        if(sc.hasNextInt()){
            int number = sc.nextInt();
            if(sc.hasNextLine()) sc.nextLine();
            
            if(number%2==0) {
                System.out.println("\n\n"+number+" is an even number\n");
            } else {
                System.out.println("\n\n"+number+" is a odd number\n");
            }

        } else {
            if(sc.hasNextLine()) sc.nextLine();
            System.out.println("\n\nInvalid Number.\n");
            return;
        }
    }
}