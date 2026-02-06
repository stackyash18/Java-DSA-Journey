public class PureFunctions {
  public static int pure(int x, int y)
  {
    if(x > 3)
    {
      return x;
    }
    else
      if( y < 4)
      {
        return y;
      }
      else
         return 0;
  }

  public  static void main(String[] args)
  {
    int a = 5, b = 2;
    int result = pure(a,b);
    System.out.println(result);
  }
}
