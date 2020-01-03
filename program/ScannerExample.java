import java.util.*;  
   class ScannerExample {  
public static void main(String args[]){  
          Scanner in = new Scanner(System.in);  
          System.out.println("Enter Your idnumber: ");
          int id =in.nextInt();
          System.out.println("idnumber is: "+id);


          System.out.print("Enter your name: ");
          in.nextLine();  
          String name = in.nextLine();  
          System.out.println("Name is: " + name);             
                       
          }  
}  