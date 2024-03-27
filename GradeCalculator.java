import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student Grade Calculator");
        System.out.println("Enter the total marks and obtained marks for each subject.");

        System.out.print("Enter the total number of subjects: ");
        int totalSubjects = scanner.nextInt();

        double totalMarks = 0;
        double obtainedMarks = 0;

        for (int i = 1; i <= totalSubjects; i++) {
            System.out.print("Enter total marks for subject " + i + ": ");
            double subjectTotalMarks = scanner.nextDouble();
            totalMarks += subjectTotalMarks;

            System.out.print("Enter obtained marks for subject " + i + ": ");
            double subjectObtainedMarks = scanner.nextDouble();
            obtainedMarks += subjectObtainedMarks;
        }

        double percentage = (obtainedMarks / totalMarks) * 100;

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Obtained Marks: " + obtainedMarks);
        System.out.println("Percentage: " + percentage + "%");

        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 50) {
            grade = 'E';
        } else {
            grade = 'U';
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

