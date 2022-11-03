import java.util.*;
class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      int word_count=0;
      for(int i=0;i<s1.length();i++)
      {
    	  char ch=s1.charAt(i);
    	  if(ch!=' ')
    	  word_count++;
    	  else
    	  {
    		  System.out.print(word_count+" ");
    		  word_count=0;
    	  } 
      }
      System.out.print(word_count);
	}
 
}