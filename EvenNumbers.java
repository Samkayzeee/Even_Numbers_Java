import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;


        System.out.print("Please input a number between 1 and 100: ");
        int inputNumber = scanner.nextInt();

        if (inputNumber > 100) {
            System.out.println("The number you input is greater than 100");
        }
        else if (inputNumber % 2 == 0) {
            for (int i = 1; i < inputNumber; i++) {
                
            }
        }
        else {
            System.out.println("The number will generate odd Numbers");
        }





        scanner.close();
    }
}