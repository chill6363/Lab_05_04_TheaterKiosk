import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userAge;

        System.out.print("Enter your age: ");
        while(!in.hasNextInt()) {
            System.out.print("Invalid input. Try again: ");
            in.nextLine();
        }
        userAge = in.nextInt();
        if(userAge >= 21) {
            System.out.println("You are of valid age. You get a wrist band.");
        }
    }
}