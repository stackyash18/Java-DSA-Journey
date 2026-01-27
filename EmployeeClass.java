
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
    Employee Arun = new Employee(); 


    //Setting the Attributes
    Yash.id = 1829;
    Yash.name = "Yash Tomar";
    Arun.id = 1831;
    Arun.name = "Arun Kumar";
 
    //Printing the Attributes
    Yash.printDetails();
    Arun.printDetails();
    
  }
}
