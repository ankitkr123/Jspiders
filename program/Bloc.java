class Test{
	static int i;
	int j;
	static {
		i=10;
		System.out.println("static block executed");
	}
{
	j=20;
	System.out.println("non-static block executed");
}
}

class Bloc{
	public static void main(String [] args){
		System.out.println(Test.i);
	Test a=new Test();
		System.out.println(a.j);

	}
}