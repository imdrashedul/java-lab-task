package tasks;

import java.util.Scanner;

public class LeapYear implements ITasks {
    public void execute(Scanner sc) {
        System.out.print("Please enter a year: ");
        if(sc.hasNextInt()){
            int year = sc.nextInt();
            sc.nextLine();
            
            if((year%4==0 && year%100!=0) || year%400==0) {
                System.out.println("\n\n"+year+" is a leap year\n");
            } else {
                System.out.println("\n\n"+year+" is not a leap year\n");
            }
        } else {
            sc.nextLine();
            System.out.println("\n\nInvalid Year.\n");
            return;
        }
    }
}