import java.util.Scanner;

class fact {
    int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}

class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        sc.close();
        fact f = new fact();
        System.out.println("Factorial of " + n + " is " + f.factorial(n));
    }
}
