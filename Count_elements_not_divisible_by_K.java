import java.util.Scanner;
class Array1
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int n,i,x[],count=0,k;
  n=sc.nextInt();
  x=new int[n];
  k=sc.nextInt();
  for ( i=0;i<n;i++)
   x[i]=sc.nextInt();
  for( i=0;i<n;i++)
  {
   if((x[i]%k)!=0)
    {
     count++;
     }
  }
   System.out.println(count);
 }
}
