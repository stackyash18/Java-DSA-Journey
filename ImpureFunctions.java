public class ImpureFunctions {
   int  h ;

  public static void display (ImpureFunctions T)
  {
    T.h = T.h +100;
  }
   
  public static void main(String[] args)
  {
    ImpureFunctions obj = new ImpureFunctions();
    obj.h  = 10;
    System.out.println("Value of H before Function cal: " + obj.h);
    display(obj);
    System.out.println("Value of H after Function cal: " + obj.h);


  }
}
