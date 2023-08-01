

public class Mainclass {

   public static void main(String[] args) {
   Employee mrBogdan= new Employee();
   Employee msBird = new Employee();

   mrBogdan.setEmpID(1001);
   mrBogdan.setEmpName("Bogdan");
   mrBogdan.setEmpDesignation("Computer Architecture");
   
   System.out.println("Employee ID: " + mrBogdan.getEmpID());
   System.out.println("Employee Name: " + mrBogdan.getEmpName());
   System.out.println("Employee Designation: " + mrBogdan.getEmpDesignation() );

   
   
   }

}

