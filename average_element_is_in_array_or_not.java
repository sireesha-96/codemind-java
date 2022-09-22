import java.util.Scanner;
class ArrayDemo3
{
  public static void main(String args[])
   {
         Scanner sc=new Scanner(System.in);
         int x[],i,n,av=1,sum=0;
		 n=sc.nextInt();

         x=new int[n];
         for(i=0;i<n;i++)
           {
             x[i]=sc.nextInt();
           }

         for(i=0;i<n;i++)
          {
             sum=sum+x[i];
             av=sum/n;
             if(av==i)
             {
			   System.out.print("True");
			   break;
             }
             else
              {
              System.out.println("False");
              break;
              }
           }
     }
}
