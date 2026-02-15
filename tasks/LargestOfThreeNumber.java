package tasks;

import java.util.Scanner;

public class LargestOfThreeNumber implements ITasks {
    public void execute(Scanner sc) {
        System.out.println("\nGive me three integers, and I'll show you which one is the largest.\n\n");

        System.out.print("Please enter 3 integer: \n1st = ");
        if(sc.hasNextInt()){
            int max = 0;
            int inp = sc.nextInt();
            if(sc.hasNextLine()) sc.nextLine();

            max = inp;

            System.out.print("2nd = ");
            if(sc.hasNextInt()){
                inp = sc.nextInt();
                if(sc.hasNextLine()) sc.nextLine();

                if(inp > max) max = inp;

                System.out.print("3rd = ");
                if(sc.hasNextInt()){
                    inp = sc.nextInt();
                    if(sc.hasNextLine()) sc.nextLine();

                    if(inp > max) max = inp;

                    System.out.println("\n\n"+max+" is the largest number.\n");
                } else {
                    if(sc.hasNextLine()) sc.nextLine();
                    System.out.println("\n\nInvalid 3rd Number.\n");
                    return;
                }
            } else {
                if(sc.hasNextLine()) sc.nextLine();
                System.out.println("\n\nInvalid 2nd Number.\n");
                return;
            }
        } else {
            if(sc.hasNextLine()) sc.nextLine();
            System.out.println("\n\nInvalid 1st Number.\n");
            return;
        }
    }
}