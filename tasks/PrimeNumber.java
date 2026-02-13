package tasks;

public class PrimeNumber implements ITasks {
    public void execute(Scanner sc) {
        System.out.print("Please enter a number: ");
        if(sc.hasNextInt()){
            int number = sc.nextInt();
            sc.nextLine();
            

        } else {
            sc.nextLine();
            System.out.println("\n\nInvalid Number.\n");
            return;
        }
    }
}