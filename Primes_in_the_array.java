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
  int a,x[],c=0,i;
  Scanner sc=new Scanner(System.in);
  a=sc.nextInt();
  x=new int[a];
  for(i=0;i<a;i++)
   x[i]=sc.nextInt();
  for(i=0;i<a;i++)
  {
    if( prime(x[i]))
    {
        c++;
    }
  }
   System.out.println(c);
  }
}
 
