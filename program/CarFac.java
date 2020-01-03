class Car{ //car class name
 static String brandName; //static is keyword
	       String model;  //string is class always start with capital
	       String colour;
	       void details(){  //void is keyword and details is method name it always start with lower case
	       	System.out.println(brandName); // 
	       	System.out.println(model);
	       	System.out.println(colour);
	       }
}

class CarFac{
	public static void main(String[] args) {
		Car.brandName="Maruti";
		Car c1 =new Car();
		c1.model="800";
		c1.colour="blue";
		c1.details();
        
  

	}

}