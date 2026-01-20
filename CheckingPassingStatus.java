import java.util.Scanner;

public class CheckingPassingStatus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks obtained in Physics (out of 80): ");
        int physicsMarks = input.nextInt();
        float physicsPercent = (physicsMarks / 80.0f) * 100;

        System.out.print("Enter marks obtained in Chemistry (out of 80): ");
        int chemistryMarks = input.nextInt();
        float chemistryPercent = (chemistryMarks / 80.0f) * 100;

        System.out.print("Enter marks obtained in Mathematics (out of 80): ");
        int mathsMarks = input.nextInt();
        float mathsPercent = (mathsMarks / 80.0f) * 100;

        int obtainedMarks = physicsMarks + chemistryMarks + mathsMarks;
        int totalMarks = 240;

        float percentage = (obtainedMarks / (float) totalMarks) * 100;

        System.out.println("\nOverall Percentage: " + percentage + "%");

        if (percentage >= 40.0 && physicsPercent >= 33.0 && chemistryPercent >= 33.0 && mathsPercent >= 33.0) {
            System.out.println("Congratulations! You have passed.");
        } else {
            System.out.println("Sorry, you have failed.");
        }

        input.close();
    }
}
