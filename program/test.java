class Employee{
	static String company_name;
	       String employee_name;
	       int employee_id;
	       void details(){
	       	System.out.println(employee_name);
	       	System.out.println(employee_id);

	       }



}
class Test{
	public static void main(String [] args){

   Employee.company_name="wipro";
   Employee e1 = new Employee ();
   e1.employee_name="rajat";
   e1.employee_id=123;
   e1.details();

   Employee e2 = new Employee ();
   e2.employee_name="amit";
   e2.employee_id=1224;
   e2.details();




	}
}


