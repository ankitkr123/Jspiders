class Test{
	int id;
	String name;
	Test(int id, String name){
		this.id=id;
		this.name=name;


	}

	
	
}  


class ObjCla{
	public static void main(String[] args) {
		Test t1=new Test(123, "ram");
		Test t2=new Test(123,"ram");
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}
}

