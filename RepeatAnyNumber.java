import java.util.Scanner;

public class RepeatAnyNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number how much to be repeated: ");
    int n = input.nextInt();

    int i = 1;
    while (i <= n) 
    {
      System.out.println(5);
      i++;
    }
    input.close();
  }
}
