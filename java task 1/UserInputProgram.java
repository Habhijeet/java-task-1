import java.util.Scanner;

public class UserInputProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first integer: ");
        int firstInt = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondInt = scanner.nextInt();

        
        System.out.print("Enter a floating-point number: ");
        double floatNum = scanner.nextDouble();

       
        System.out.print("Enter a single character: ");
        char character = scanner.next().charAt(0);

       
        System.out.print("Enter a boolean value (true/false): ");
        boolean boolValue = scanner.nextBoolean();

        
        scanner.nextLine();

       
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

      
        int sum = firstInt + secondInt;
        int difference = firstInt - secondInt;
        int product = firstInt * secondInt;

        System.out.println("Sum of " + firstInt + " and " + secondInt + " is: " + sum);
        System.out.println("Difference between " + firstInt + " and " + secondInt + " is: " + difference);
        System.out.println("Product of " + firstInt + " and " + secondInt + " is: " + product);

      
        double doubledFloatNum = floatNum * 2;
        System.out.println(floatNum + " multiplied by 2 is: " + doubledFloatNum);

       
        char nextChar = (char) (character + 1);
        System.out.println("The next character after '" + character + "' is: " + nextChar);

       
        boolean oppositeBoolValue = !boolValue;
        System.out.println("The opposite of " + boolValue + " is: " + oppositeBoolValue);

       
        System.out.println("Hello, " + name + "!");

        scanner.close();;
    }
}