import java.util.Scanner;

public class Student {
    private int student_id;
    private String student_name;
    private int[] grades;
    private int gradecount;

    public Student(int student_id, String student_name, int gradecount) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.grades = new int[gradecount];
        this.gradecount = 0;
    }

    public int getStudentId() {
        return student_id;
    }

    public void setStudentId(int student_id) {
        this.student_id = student_id;
    }

    public String getStudentName() {
        return student_name;
    }

    public void setStudentName(String student_name) {
        this.student_name = student_name;
    }

    public void addGrade(int grade) {
        if (gradecount < grades.length) {
            if (grade >= 0 && grade <= 100) {
                grades[gradecount] = grade;
                gradecount++;
                System.out.println("Grade added");
            } else {
                System.out.println("Invalid grade");
            }
        } else {
            System.out.println("Grade limit reached");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter the number of grades to enter: ");
        int gradeCount = scanner.nextInt();

        Student student = new Student(studentId, studentName, gradeCount);

        for (int i = 0; i < gradeCount; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            int grade = scanner.nextInt();
            student.addGrade(grade);
        }

        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());

        for (int i = 0; i < student.gradecount; i++) {
            System.out.println("Grade " + (i + 1) + ": " + student.grades[i]);
        }

        scanner.close(); // Close the scanner when done.
    }
}
