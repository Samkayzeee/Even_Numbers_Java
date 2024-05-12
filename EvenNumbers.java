import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to type in an integer value
        System.out.print("Enter an integer value: ");
        int number = scanner.nextInt();

        // Check if the number is greater than 100
        if (number > 100) {
            System.out.println("Error: The value entered is bigger than 100.");
        } else {
            // Check if the number is divisible by 2
            if (number % 2 != 0) {
                System.out.println("The number will generate odd numbers.");
            } else {
                System.out.println("Even numbers between 1 and " + number + ":");
                int sum = 0;
                // Loop through numbers from 1 to the input number
                for (int i = 1; i <= number; i++) {
                    // Check if the number is even
                    if (i % 2 == 0) {
                        System.out.print(i + " "); // Print the even number
                        sum += i; // Add the even number to the sum
                    }
                }
                System.out.println("\nSum of even numbers: " + sum);
            }
        }

        scanner.close();
    }
}