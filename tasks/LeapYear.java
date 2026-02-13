package tasks;

import java.util.Scanner;

public class LeapYear implements ITasks {
    public void execute(Scanner sc) {
        System.out.println("\nA leap year is a calendar year with 366 days instead of 365, adding February 29 as a \"leap day\" to keep our calendar aligned with the Earth's orbit around the sun (approx. 365.25 days).\nThese occur every four years, except for century years not divisible by 400. \n\n");

        System.out.print("Please enter a year: ");
        if(sc.hasNextInt()){
            int year = sc.nextInt();
            if(sc.hasNextLine()) sc.nextLine();
            
            if((year%4==0 && year%100!=0) || year%400==0) {
                System.out.println("\n\n"+year+" is a leap year\n");
            } else {
                System.out.println("\n\n"+year+" is not a leap year\n");
            }
        } else {
            if(sc.hasNextLine()) sc.nextLine();
            System.out.println("\n\nInvalid Year.\n");
            return;
        }
    }
}