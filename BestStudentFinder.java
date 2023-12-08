import java.util.Scanner;

public class BestStudentFinder {
    public static void main(String[] args) {
        final int NUM_STUDENTS = 10;
        final int NUM_SUBJECTS = 5;
        int[][] marks = new int[NUM_STUDENTS][NUM_SUBJECTS];
        inputMarks(marks);
        double[] averageMarks = calculateAverageMarks(marks);

        int bestStudentIndex = findBestStudent(averageMarks);

        displayBestStudentDetails(marks, averageMarks, bestStudentIndex);
    }

    private static void inputMarks(int[][] marks) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextInt();
            }
        }
    }

    private static double[] calculateAverageMarks(int[][] marks) {
        double[] averageMarks = new double[marks.length];

        for (int i = 0; i < marks.length; i++) {
            int totalMarks = 0;
            for (int j = 0; j < marks[i].length; j++) {
                totalMarks += marks[i][j];
            }
            averageMarks[i] = (double) totalMarks / marks[i].length;
        }

        return averageMarks;
    }

    private static int findBestStudent(double[] averageMarks) {
        int bestStudentIndex = 0;
        double highestAverage = averageMarks[0];

        for (int i = 1; i < averageMarks.length; i++) {
            if (averageMarks[i] > highestAverage) {
                bestStudentIndex = i;
                highestAverage = averageMarks[i];
            }
        }

        return bestStudentIndex;
    }

    private static void displayBestStudentDetails(int[][] marks, double[] averageMarks, int bestStudentIndex) {
        System.out.println("\nDetails of the best student:");
        System.out.println("Student ID: " + (bestStudentIndex + 1));
        System.out.println("Average Marks: " + averageMarks[bestStudentIndex]);
        System.out.println("Individual Subject Marks:");

        for (int i = 0; i < marks[bestStudentIndex].length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[bestStudentIndex][i]);
        }
    }
}
