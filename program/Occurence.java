class Occurence{
	public static void main(String[] args){
		String s="abc hello i am abc is";

		String arr[]=s.split(" ");

		for(int i=0; i<arr.length; i++){
				if(arr[i]!=null){
					for(int j=i+1; j<arr.length; j++){
						if((arr[i]).equals(arr[j])){

							arr[j]=null;
						}
					}
				}
		    
		}
		for(int k=0; k<arr.length; k++){
			if(arr[k]!=null){
			System.out.print(arr[k]+" ");
		}
		}
	}
}