import java.util.Scanner;
class ArrayDemo3
{
  public static void main(String args[])
   {
         Scanner sc=new Scanner(System.in);
         int x[],i,n,sum=0;
         double av=1;
		 n=sc.nextInt();

         x=new int[n];
         for(i=0;i<n;i++)
             x[i]=sc.nextInt();
         for(i=0;i<n;i++)
          {
             sum=sum+x[i];
             av=sum/(float)n;
          }
	     System.out.format("%.2f",av);
 
     }
}
