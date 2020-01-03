class PatternD{
	public static void main(String[] args) {
		int star=1;
		for(int m=1; m<=10; m++){
			for(int k=1; k<=star; k++){
				System.out.print("*");

			}
			System.out.println();
			if(m<5){
			star++;
			}
			else{
				star--;
			}
		}
	}
}