import java.util.Scanner;

abstract class add2 {
    public abstract int add(int a, int b);

    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        int sum = add(num1, num2);
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}

class add3 extends add2 {
    public int add(int a, int b) {
        return a + b;
    }
}

public class add2abstract {
    public static void main(String[] args) {
        add3 add4 = new add3();
        add4.getUserInput();
    }
}
