class A{
	int i=10;
	void m1(){
		System.out.println("m1() of A");
	}

}

class B extends A{
	int j=20;
	void m2(){
		System.out.println("m2() of B");
	}
}

class Type{
	public static void main(String[] args) {
		A a=(A) new B();
		System.out.println(a.i);
		a.m1();

		B b= (B) a;
		System.out.println(b.i);
		System.out.println(b.j);
		b.m1();
		b.m2();





	}
}