import java.util.Scanner;
class Array1
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int n,i,x[],sum=0;
  n=sc.nextInt();
  x=new int[n];
  for ( i=0;i<n;i++)
   x[i]=sc.nextInt();
  for( i=0;i<n;i++)
  {
   if(i%2==0)
    sum=sum+x[i];
   }
   System.out.println(sum);
 }
}
