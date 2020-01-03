class A{
	int i=10;
	
}

class B extends A{
	int i=20;
	
	void m1(){
		System.out.println(super.i);
		System.out.println(i);

	}

}

class Asup{
	public static void main(String[] args) {
		B b=new B();
		b.m1();
	}
}