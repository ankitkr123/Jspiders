interface BankAccount{
	void withdraw(double amount);
	void deposit(double amount);
	void balanceCheck();

}


class Saving implements BankAccount{
	String name;
	String address;
	long account;
	double balance;
	Saving(String name,String address,long account,double balance){
		this.name=name;
		this.address=address;
		this.account;
		this.balance;
	}

	public withdraw(double ammount){
		System.out.println("account holder name: "+name);
		System.out.println("account holder address: "+address);
		System.out.println("account holder account: "+account);
		System.out.println("account holder balance: "+balance);
	}
}