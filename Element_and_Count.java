import java.util.Scanner;
class Unique
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int n,i,j,x[],count=0;
  n=sc.nextInt();
  x=new int[n];
  for ( i=0;i<n;i++)
   x[i]=sc.nextInt();
  for( i=0;i<n;i++)
  {
   if (x[i]!=-999)
    {
     count=1;
     for(j=0;j<n;j++)
     {
      if(x[i]==x[j]&&i!=j)
      {
       count++;
       x[j]=-999;
       }
      }
      System.out.print(x[i] +" "+count+" ");
     }
    }
 }
}
