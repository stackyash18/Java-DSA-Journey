public class MethodsWithoutStatic {
   int sum(int x, int y)
   {
    return x + y;

   }
  public static void main(String[] args) {

  MethodsWithoutStatic obj = new MethodsWithoutStatic();
  System.out.println(obj.sum(5, 10));
    
  }
}

//Methods Invocation usinf object creation
