import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if(isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int n = 0;
        int sum = 0;

        // Calculate the number of digits in the number
        while (number > 0) {
            number = number / 10;
            n++;
        }

        number = originalNumber; // Reset number to the original value

        // Calculate the sum of digits raised to the nth power
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, n);
            number = number / 10;
        }

        return sum == originalNumber;
    }
}
