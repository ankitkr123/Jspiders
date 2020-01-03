class Z{
	int m=20;
	void mat(){
		System.out.println("Father");
	}
}

class X extends Z{
	int n=50;
	void mat(){
		System.out.println("Son");
	}

}

class Inh2{
	public static void main(String [] args){
		X a=new X();
		System.out.println(a.m);
		System.out.println(a.n);




	}
}