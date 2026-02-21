 import java.util.Random;
 import java.util.Scanner;
 /*
    Create a class Game, which allows a user to play "Guess the Number " game once. Game should have the following methods:
    1.Contructors to generate the random number.
    2.TakeUserInput to take a user input of number.
    3.isCorrectNumber() to detect whether the number entered by the user is true.
    4.Getters and Setters for noOfGuesses.
     Use properties such as noOfGuesses(Int), etc to get  this task done!
    */
     class Game
     {
     Game()
     {
      Random rand = new Random();
      this.Number = rand.nextInt(100) + 1;
     }
     
     public int InputNumber;
     public int Number;
     public int noOfGuesses = 0;

    
     public int getNoOfGuesses()
      {
       return noOfGuesses;
      }
      public void setNoOfGuesses(int noOfGuesses)
      {
       this.noOfGuesses = noOfGuesses;
      }

     void takeUserInput()
     {
      System.out.println("Guess the number: ");
      Scanner sc = new Scanner(System.in);
      InputNumber = sc.nextInt();
     }

     boolean isCorrectNumber()
     {
        noOfGuesses++;
      if(Number == InputNumber)
      {
        System.out.println("Congratulations! You guessed the number.");
       return true;
      }
      else if(Number > InputNumber)
      {
        System.out.println("Your number is smaller than the actual number");
      }
       else if(Number < InputNumber)
       {
        System.out.println("Your number is greater than the actual number");
       }
       return false;
     }
     }
     
     public class Sample
     {
      public static void main(String[] args)
      {
       Game g = new Game();
       boolean b = false;
       while(!b)
       {
        g.takeUserInput();
        b = g.isCorrectNumber();
        System.out.println("Number of Guesses: " + g.getNoOfGuesses());
       }
       
      }
    }