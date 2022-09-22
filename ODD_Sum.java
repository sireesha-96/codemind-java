import java.util.Scanner;
class ArrayDemo3
{
  public static void main(String args[])
   {
         Scanner sc=new Scanner(System.in);
         int x[],i,n,sum=0;
		 n=sc.nextInt();

         x=new int[n];

		 //Reading of an array elements         
         for(i=0;i<n;i++)
           {
             x[i]=sc.nextInt();
           }

         for(i=0;i<n;i++)
          {
             if(x[i]%2!=0)
              sum=sum+x[i];
          }
			   System.out.println(sum);
     }
}