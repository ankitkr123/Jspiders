class Student{
	int id;
	String name;
	void details(){
		System.out.println(id);
		System.out.println(name);
	}
}

class Institute{
	public static void main(String [] args){
		Student s1=new Student();
        s1.id=134;
        s1.name="amit";
		s1.details();
	}
}