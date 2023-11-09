import java.util.Scanner;

public class LabOops {
    public static void main(String[] args) {
        double[] marks = new double[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 marks:");

        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextDouble();
        }

        Average obj1 = new Average();
        double avg = obj1.average(marks);

        Grade obj2 = new Grade();
        obj2.grade(marks);
        System.out.println("Average: " + avg);

        Gpa gpa = new Gpa();
        gpa.grade(avg);

        sc.close();
    }
}

class Parent {
    double sum = 0;
}

class Average extends Parent {
    public double average(double[] marks) {
        for (int i = 0; i < 5; i++) {
            sum = sum + marks[i];
        }
        return sum / 5;
    }
}

interface I1 {
    void grade(double[] marks);
}

class Grade implements I1 {
    public void grade(double[] marks) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Mark " + (i + 1) + ": " + marks[i]);
        }
    }
}

class Gpa {
    public void grade(double avg) {
        if (avg >= 90 && avg <= 100) {
            System.out.println("Grade point is 10");
        } else if (avg >= 80 && avg < 90) {
            System.out.println("Grade point is 9");
        } else if (avg >= 70 && avg < 80) {
            System.out.println("Grade point is 8");
        } else if (avg >= 60 && avg < 70) {
            System.out.println("Grade point is 7");
        } else if (avg >= 50 && avg < 60) {
            System.out.println("Grade point is 6");
        } else if (avg >= 40 && avg < 50) {
            System.out.println("Grade point is 5");
        } else {
            System.out.println("No GPA for reappearance");
        }
    }
}
