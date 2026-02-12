import java.util.Random;
import java.util.Scanner;

class GuessNumber{
  private int num;
  private int noOfGuesses;


  public GuessNumber(){
    Random rand =  new Random();
   num = rand.nextInt(100) + 1;
   noOfGuesses = 0;
  }
  
 public int takeUserInput(Scanner sc)
 {
  System.out.println("Enter you guesses: ");
  return sc.nextInt();  
 }


 public boolean isCorrectNumber(int usernum)
 {
  noOfGuesses ++;
  
  if(usernum > num)
  {
    System.out.println("Guess Lower");
    return false;

  }
  else
    if(usernum < num)
    {
      System.out.println("Guess Higher");
      return false;
    }
    else
   {
      System.out.println("Congratualations, You won");
      System.out.println("Total guesses: " + noOfGuesses);
    return true;
    }
 }

  }
public class GuessNumberUsingOOPs
{
  
  public static void main(String[] args)
  {
    /*
    Create a class Game, which allows a user to play "Guess the Number " game once. Game should have the following methods:
    1.Contructors to generate the random number.
    2.TakeUserInput to take a user input of number.
    3.isCorrectNumber() to detect whether the number entered by the user is true.
    4.Getters and Setters for noOfGuesses.
     Use properties such as noOfGuesses(Int), etc to get  this task done!
    */

     Scanner input = new Scanner(System.in);
     GuessNumber g1 = new GuessNumber();
     
     boolean correct = false;

     while(!correct)
     {
      int usernum = g1.takeUserInput(input);
      correct = g1.isCorrectNumber(usernum);
     }
     
    
    input.close();


  }
}