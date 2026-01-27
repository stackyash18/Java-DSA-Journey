
 class Employee {
int id;
String name;
public void printDetails() {
  System.out.println("\nID: " + id + "\nName: " + name + "\n");
}
 }
public class EmployeeClass {
  public static void main(String[] args) {

    System.out.println("This is custom java class");
    
    // Instantiating the Employee class 
    Employee Yash = new Employee();
    Employee Arjun = new Employee(); 


    //Setting the Attributes
    Yash.id = 1829;
    Yash.name = "Yash Tomar";
    Arjun.id = 1831;
    Arjun.name = "Arjun Kumar";
 
    //Printing the Attributes
    Yash.printDetails();
    Arjun.printDetails();
    
  }
}
