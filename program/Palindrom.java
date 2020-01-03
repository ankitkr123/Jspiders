import java.util.Scanner;
class Palindrom{
  public static void main(String[] args){
    while(true){
    System.out.println("Enter a num");
    Scanner sc = new Scanner(System.in);

  	 int num=sc.nextInt();
  	
  	   int rev;
  	   int sum=0;
  	   int temp=num;
  	  while (num!=0){
  	  	rev=num%10;
  	  	sum = rev + sum*10; 
  	  	num=num/10;
  	  }
  	  if(temp==sum){
        System.out.println("Palindrom");
      }
      else{
        System.out.println("not palindrom");
      }
      }
  	  
  }

}