class PatternB{
	public static void main(String[] args) {
		int str=1;
		for(int i=1; i<=3; i++){
			for(int j=1; j<=str; j++){
				System.out.print("*");
			}
			System.out.println();
			str++;
		}

	}
}