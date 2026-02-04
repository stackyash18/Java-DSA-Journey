import java.util.Scanner;
public class PrivateFunction {

   class MyEmployee
  {
    private int id;
    private String name;


    public String getName()
    {
      return name;
    }
    public void setName(String n)
    {
      name = n;
    }
  
    public void setId(int i)
    {
      id = i;
    }

    public int getId()
    {
      return id;
    }


  }

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    PrivateFunction outer = new PrivateFunction();
    MyEmployee Harry = outer.new MyEmployee();
    String name = input.nextLine();
    Harry.setName(name);
    
    int Id = input.nextInt();
    Harry.setId(Id);

    System.out.println("Name: " + Harry.getName());
    System.out.println("Id: " + Harry.getId());

    input.close();
  }

}