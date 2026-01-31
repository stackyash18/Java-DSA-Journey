import java.util.Scanner;

public class RectangleClass {

  static class Rectangle
  {
  int length;
  int breadth;

  public int area()
  {
    return length * breadth;
  }

  public int perimeter()
  {
    return 2 * (length + breadth);
  }
  }
  public static void main(String[] args)
  {
   Scanner sc = new Scanner(System.in);


    System.out.print("Enter the length of the Rectangle: ");
    Rectangle rect1 = new Rectangle();
    rect1.length = sc.nextInt();

    System.out.print("Enter the breadth of the Rectangle: ");
    rect1.breadth = sc.nextInt();

    System.out.println("Area of Rectangle: " + rect1.area());
    System.out.println("Perimeter of Rectangle: " + rect1.perimeter());


    sc.close();
    
  }
}
