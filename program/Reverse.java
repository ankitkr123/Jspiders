import java.util.Scanner;
class Reverse{
  public static void main(String[] args){
    System.out.println("Enter a num");
    Scanner sc = new Scanner(System.in);

  	 int num=sc.nextInt();
  	
  	   int rev;
  	   int sum=0;
  	   // int sum=0;
  	  while (num!=0){
  	  	rev=num%10;
  	  	sum = rev + sum*10; 
  	  	num=num/10;
  	  }
  	  System.out.println(sum);

  	  
  }

}