import java.util.*;

public class StringSplitExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of mobile numbers to be printed");
        int n = sc.nextInt();
        sc.nextLine();

        String[] csv = new String[n];
        System.out.println("Enter mobile number in format (***)***-****");

        for (int i = 0; i < n; i++) {
            csv[i] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            String[] values = csv[i].split("[()-]");
            System.out.println("Area code: " + values[1]);
            System.out.println("Phone number: " + values[2] + values[3]);
        }
    }
}
