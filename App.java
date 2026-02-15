import java.util.Scanner;
import java.util.NoSuchElementException;
import tasks.ITasks;
import java.lang.reflect.InvocationTargetException;

import tasks.EvenOddNumber;
import tasks.PrimeNumber;
import tasks.LeapYear;
import tasks.FibonacciSeries;
import tasks.FactorialOfANumber;
import tasks.ArmstrongNumber;
import tasks.PalindromeNumber;
import tasks.Swap2Number;
import tasks.LargestOfThreeNumber;

public class App {
    static String[] tasks = {
        "EvenOddNumber", 
        "PrimeNumber",
        "LeapYear",
        "FibonacciSeries",
        "FactorialOfANumber",
        "ArmstrongNumber",
        "PalindromeNumber",
        "Swap2Number",
        "LargestOfThreeNumber",
        "GoldbachsConjecture",
        "PyramidPattern",
        "FloydsTriangle",
        "PascalTriangle",
    };

    static String[] taskTitles = {
        "Even Odd Number", 
        "Prime Number",
        "Leap Year",
        "Fibonacci Series",
        "Factorial of a Number",
        "Armstrong Number",
        "Palindrome Number",
        "Swap 2 Number (without temporary variable)",
        "Largest of three Number",
        "Goldbach's conjecture",
        "Pyramid Pattern",
        "Floyd's Triangle",
        "Pascal Triangle",
    };

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        printMenu();
    }

    public static void showBack() 
    {
        System.out.print("Choose a option:\n1. Back to Menu\n2. Exit\nEnter option: ");
        if(sc.hasNextInt()) {
            int opt = sc.nextInt();
            if(sc.hasNextLine()) sc.nextLine();

            if(opt==1) {
                printMenu();
            } else if (opt!=2) {
                Utils.clearConsole();
                System.out.println("Invalid Option Choosen.\n");
                showBack();
            }
        } else {
            Utils.clearConsole();
            System.out.println("Invalid Option Choosen.\n");
            if(sc.hasNextLine()) sc.nextLine();
            showBack();
        }
    }

    public static void showBackWithRepeat(int optp) 
    {
        System.out.print("Choose a option:\n1. Repeat\n2. Back to Menu\n3. Exit\nEnter option: ");
        if(sc.hasNextInt()) {
            int opt = sc.nextInt();
            if(sc.hasNextLine()) sc.nextLine();

            if(opt==1) {
                execMenu(optp);
            } else if (opt==2) {
                printMenu();
            } else if (opt!=1 && opt!=2 && opt!=3) {
                Utils.clearConsole();
                System.out.println("Invalid Option Choosen.\n");
                showBackWithRepeat(optp);
            }
        } else {
            Utils.clearConsole();
            System.out.println("Invalid Option Choosen.\n");
            if(sc.hasNextLine()) sc.nextLine();
            showBackWithRepeat(optp);
        }
    }

    public static void execMenu(int opt) {
        Utils.clearConsole();
        System.out.println("Eexecuting Task: "+(opt+1)+". "+taskTitles[opt]+"\n");

        try {
            Class<?> dc = Class.forName("tasks."+tasks[opt]);
            ITasks dco = (ITasks) dc.getDeclaredConstructor().newInstance();
            dco.execute(sc);
        } catch (ClassNotFoundException e) {
            System.out.println("\nTask Not Implemented Yet\n");
        } catch (NoSuchMethodException e) {
            System.out.println("\nTask Not Implemented Yet\n");
        } catch (InstantiationException e) {
            System.out.println("\nTask Not Implemented Yet\n");
        } catch (IllegalAccessException e) {
            System.out.println("\nTask Not Implemented Yet\n");
        } catch (InvocationTargetException e) {
            System.out.println("\nTask Not Implemented Yet\n");
        }

        System.out.println("");
        showBackWithRepeat(opt);
    }

    public static void printMenu() {
        Utils.clearConsole();

        System.out.println("Lab Task List:");
        int i = 0;

        for(; i < taskTitles.length; i++) {
            System.out.println(i+1 + ". " + taskTitles[i]);
        }

        System.out.println(i+1 + ". Exit");
        i++;
        System.out.print("\nEnter Option: ");

        if(sc.hasNextInt()) {
            int opt = sc.nextInt();
            if(sc.hasNextLine()) sc.nextLine();

            if(opt<1 || opt>i) {
                Utils.clearConsole();
                System.out.println("Invalid Option Choosen.\n");
                showBack();
                return;
            }
            
            opt--;

            if(opt >= tasks.length || opt < 0) {
                return;
            }
            
            execMenu(opt);
        } else {
            Utils.clearConsole();
            System.out.println("Invalid Option Choosen.\n");
            if(sc.hasNextLine()) sc.nextLine();
            showBack();
        }
    }
}