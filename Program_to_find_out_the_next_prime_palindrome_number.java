import java.util.Scanner;
class Prime
{
 public static boolean prime(int n)
 {
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
  public static boolean pail(int n)
  {
      int r,res=0;
      int temp=n;
      while(n>0)
      {
          r=n%10;
          res=res*10+r;
          n=n/10;
      }
      if(temp==res)
       return true;
      else 
       return false;
  }
 public static void main(String args[])
 {
  int n,i;
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  for(i=n+1; ;i++)
  {
  if( prime(i)&&pail(i))
  {
   System.out.println(i);
   break;
   }
  }
}
}
 
