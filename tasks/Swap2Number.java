package tasks;

import java.util.Scanner;

public class Swap2Number implements ITasks {
    public void execute(Scanner sc) {
        System.out.println("\nSwap 2 Number Without Tempory Variable using a concept of Bitwise XOR Operation.\nFirst, the two numbers are combined using XOR and stored in one variable.\nThen, XOR is applied again to remove one number and recover the other.\nApplying XOR one final time removes the remaining original value, resulting in the numbers being exchanged without using any temporary variable.\n\n");

        System.out.print("Please enter Value of: \nA = ");
        if(sc.hasNextInt()){
            int vA = sc.nextInt();
            if(sc.hasNextLine()) sc.nextLine();

            System.out.print("B = ");
            if(sc.hasNextInt()){
                int vB = sc.nextInt();
                if(sc.hasNextLine()) sc.nextLine();

                vA = vA ^ vB;
                vB = vA ^ vB;
                vA = vA ^ vB;

                System.out.println("\n\nAfter Swap: ");
                System.out.println("A = " + vA);
                System.out.println("B = " + vB);
                System.out.println("\n");

            } else {
                if(sc.hasNextLine()) sc.nextLine();
                System.out.println("\n\nInvalid Number B.\n");
                return;
            }
        } else {
            if(sc.hasNextLine()) sc.nextLine();
            System.out.println("\n\nInvalid Number A.\n");
            return;
        }
    }
}