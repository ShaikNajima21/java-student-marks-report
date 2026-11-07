
import java.util.Scanner;

public class MarksReport {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Student Marks Report ===");

        System.out.print("How many students? ");
        int count = scanner.nextInt();

        while (count < 1) {
            System.out.print("Enter at least 1: ");
            count = scanner.nextInt();
        }

        String[] names = new String[count];
        int[] marks = new int[count];

        for (int i = 0; i < count; i++) {

            System.out.print("Name of student " + (i + 1) + ": ");
            names[i] = scanner.next();

            marks[i] = readMarks(scanner);
        }

        System.out.println();

        System.out.printf("%-10s %5s %5s%n", "Name", "Marks", "Grade");
        System.out.println("----------------------");

        int passed = 0;

        for (int i = 0; i < count; i++) {

            System.out.printf("%-10s %5d %5s%n",
                    names[i], marks[i], gradeFor(marks[i]));

            if (marks[i] >= 35) {
                passed++;
            }
        }

        System.out.println("----------------------");

        System.out.printf("Class average: %.2f%n", average(marks));

        int topper = topperIndex(marks);

        System.out.println("Topper: " + names[topper] + " (" + marks[topper] + ")");

        System.out.println("Passed: " + passed + " of " + count);

        scanner.close();
    }

    public static int readMarks(Scanner scanner) {

        System.out.print("Marks (0-100): ");
        int marks = scanner.nextInt();

        while (marks < 0 || marks > 100) {

            System.out.print("Marks must be from 0 to 100. Try again: ");
            marks = scanner.nextInt();
        }

        return marks;
    }

    public static String gradeFor(int m) {

        if (m >= 90) {
            return "A";
        } else if (m >= 75) {
            return "B";
        } else if (m >= 60) {
            return "C";
        } else if (m >= 35) {
            return "D";
        } else {
            return "F";
        }
    }

    public static double average(int[] marks) {

        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }

        return (double) total / marks.length;
    }

    public static int topperIndex(int[] marks) {

        int topper = 0;

        for (int i = 1; i < marks.length; i++) {

            if (marks[i] > marks[topper]) {
                topper = i;
            }
        }

        return topper;
    }
}
