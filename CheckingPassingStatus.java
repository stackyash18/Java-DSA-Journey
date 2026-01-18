import java.util.Scanner;

public class CheckingPassingStatus {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter marks obtained in Physics:");
    int physicsMarks = input.nextInt();
    float physicsPercent = (physicsMarks / 80.0f) * 100;

    System.out.println("Enter marks obtained in Chemistry:");
    int chemistryMarks = input.nextInt();
    float chemistryPercent = (chemistryMarks / 80.0f) * 100;

    System.out.println("Enter marks obtained in Mathematics:");
    int mathematicsMarks = input.nextInt();
    float mathematicsPercent = (mathematicsMarks / 80.0f) * 100;

    int obtainedMarks = physicsMarks + chemistryMarks + mathematicsMarks;

    int totalMarks = 240;

    float percentage = (obtainedMarks / (float)totalMarks) * 100;
    System.out.println("Your overall percentage is: " + percentage + "%");
    
    if (percentage >= 40.0 && physicsMarks >= 33.0 && chemistryMarks >= 33.0 && mathematicsMarks >= 33.0) {
      System.out.println("Congratulations! You have passed.");
    } else {
      System.out.println("Sorry, you have failed.");
      
    }
  }
}


// Write a program to finf out Whether a Student is pass or fail; if it requires total 40% and at least 33% in each subject to pass. assume 3 subjects and take marks as input from the user. //