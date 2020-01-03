class Eg{
  public static void main(String[] args){

  	 int num=123;
  	
  	   int rev;
  	   int sum=0;
  	   // int sum=0;
  	  while (num!=0){
  	  	rev=num%10;
  	  	sum = rev + sum*10; 
  	  	num=num/10;
  	  }
  	  System.out.println(sum);

  	  System.out.println("*****");
  	  int rev1=0;
  	  int number=12345;

  	  for(int i=1;i<=5;i++){
          int remainder = number%10;
          rev1= remainder + rev1*10;
       number= number/10;
  	  }
  	  System.out.println(rev1);
  }

}