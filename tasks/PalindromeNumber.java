package tasks;

import java.util.Scanner;


public class PalindromeNumber implements ITasks {
    public void execute(Scanner sc) {
        System.out.println("\nA palindrome number is an integer that remains exactly the same when its digits are reversed, reading the same both forward and backward. \n\n");

        System.out.print("Please enter a number: ");
        if(sc.hasNextLine()){
            String inp = sc.nextLine();
            
            if(this.isPalindrome(inp)) {
                System.out.println("\n\n"+inp+" is a palindrome\n");
            } else {
                System.out.println("\n\n"+inp+" is not a palindrome\n");
            }

        } else {
            System.out.println("\n\nInvalid String.\n");
            return;
        }
    }

    private boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;

        while(left < right) {
            if(text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}