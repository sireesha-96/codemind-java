import java.util.Scanner;
class ArrayDemo3
{
  public static void main(String args[])
   {
         Scanner sc=new Scanner(System.in);
         int x[],i,n,min=0;
		 n=sc.nextInt();

         x=new int[n];

		 //Reading of an array elements         
         for(i=0;i<n;i++)
           {
             x[i]=sc.nextInt();
           }

         for(i=0;i<n;i++)
          {
             min=x[0];
             if(x[i]<min)
              min=x[i];
          }
			   System.out.println(min);
       
     }
}