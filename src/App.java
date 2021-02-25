import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("I'm alive.");

        Scanner input;

        System.out.printf("Welcome to my calculator:%n%n");
        System.out.print("Please enter your first number:");
        double num1 = 0.0;
        
        while(num1 == 0.0) {
            try {
                input = new Scanner(System.in);
                num1 = input.nextDouble();
            } catch (Exception e) {
                System.out.println("Sorry, that wasn't a number.");
                System.out.print("Please enter your first number:");
            } 
        }
        
        System.out.print("\nPlease enter your second number:");
        double num2 = 0.0;

        while(num2 == 0.0) {
            try {
                input = new Scanner(System.in);
                num2 = input.nextDouble();
            } catch (Exception e) {
                System.out.println("Sorry, that wasn't a number.");
                System.out.print("Please enter your second number:");
            } 
        }

        

        //input.close();

        if(num1 == num2) {
            System.out.printf("%f is equal to %f.", num1, num2);
        }

        if(num1 != num2) {
            System.out.printf("%f is not equal to %f", num1, num2);
        }
    }
}
