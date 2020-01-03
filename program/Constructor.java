class Test{  
	int id;
	String name;
	int age;
	Test(){
		id=0;
		name=null;

	}

	Test(){
		id=0;
		name=null;
		age=0;

	}
		void details(){
			System.out.println("ID:"+ id);
			System.out.println("Name:"+ name);
			System.out.println("age:"+ age);
		}
	
}  


class Constructor{
	public static void main(String[] args) {
		Test t1=new Test();
		t1.details();
		t1.id=123;
		t1.name="ram";

		Test t2=new Test();
		t2.details();
		t2.id=125;
		t2.name="rahim";



	}
}