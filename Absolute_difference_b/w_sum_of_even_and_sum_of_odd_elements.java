import java.util.Scanner;
class Array1
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int n,i,x[],sum1=0,sum2=0;
  n=sc.nextInt();
  x=new int[n];
  for ( i=0;i<n;i++)
   x[i]=sc.nextInt();
  for( i=0;i<n;i++)
  {
   if(x[i]%2==0)
    {
     sum1=sum1+x[i];
     }
    if(x[i]%2!=0) 
    {
        sum2=sum2+x[i];
    }
   }
   System.out.println(Math.abs(sum1-sum2));
 }
}
