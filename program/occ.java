class occ{

public static void main(String[] args) {
      String s="ALLAH";
      int arr[]=new int[256];
      for(int i=0;i<s.length();i++){
          char c =s.charAt(i);
          arr[c]=arr[c]+1;
      }	
      for(int i=0;i<arr.length;i++){
           if(arr[i]>0){
             System.out.println( (char)i  + " occurance " + arr[i] );
           }
      }
  }

}

