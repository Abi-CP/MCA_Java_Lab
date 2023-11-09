import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date in the format MM/dd/yyyy: ");
        String inputDate = scanner.nextLine();

        String[] parts = inputDate.split("/");
        if (parts.length == 3) {
            int month = Integer.parseInt(parts[0]);
            int day = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[2]);

            if (isValidDate(month, day, year)) {
                String formattedDate = convertToText(month, day, year);
                System.out.println("Formatted date in the second format: " + formattedDate);
            } else {
                System.out.println("Invalid date. Please enter a valid date.");
            }
        } else {
            System.out.println("Invalid date format. Please enter a date in the format MM/dd/yyyy.");
        }
    }

    private static boolean isValidDate(int month, int day, int year) {
        return month >= 1 && month <= 12 && day >= 1 && day <= 31 && year >= 1000;
    }

    private static String convertToText(int month, int day, int year) {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1] + " " + day + ", " + year;
    }
}
