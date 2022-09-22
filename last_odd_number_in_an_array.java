import java.util.Scanner;
class Array
{
 public static void main(String args[])
 {
  int n,i;
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  int a[]=new int[n];
  for ( i=0;i<n;i++)
  {
   a[i]=sc.nextInt();
   }
  for( i=n-1;i>=1;i--)
  {
   if(a[i]%2!=0)
    break;
  }
  System.out.println(a[i]);
  }
}
