import java.util.Scanner;
class Prime
{
 public static boolean prime(int n)
 {
  if(n<2)
   return false;
  int count=0;
  for(int i=2;i<=Math.sqrt(n);i++)
  {
  if(n%i==0)
   count++;
   }
  if(count==0)
   return true;
  else
   return false;
  }
 public static void main(String args[])
 {
  int a,sum=0,x[],i,c=0;
  double av=1;
  Scanner sc=new Scanner(System.in);
  a=sc.nextInt();
  x=new int[a];
  for(i=0;i<a;i++)
   x[i]=sc.nextInt();
  for(i=0;i<a;i++)
  {
  if(prime(x[i]))
   {
   sum=sum+x[i];
   c++;
   av=(float)sum/c;
   }
  }
  System.out.format("%.2f",av);
 }
}
 
