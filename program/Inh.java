class A{
	int i=10;
	void m5(){
	System.out.println();
  }
}

class B extends A{
	int j=20;
	void m6(){
		System.out.println();
	}
}

class Inh{
	public static void main(String [] args){
	B c= new B();
	System.out.println(c.i);
	System.out.println(c.j);
   }
}
