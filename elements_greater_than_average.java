import java.util.Scanner;
class Array1
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int n,i,x[],count=0,sum=0;
  float av;
  n=sc.nextInt();
  x=new int[n];
  for ( i=0;i<n;i++)
   x[i]=sc.nextInt();
  for( i=0;i<n;i++)
  {
   sum=sum+x[i];
  }
  av=sum/n;
  for(i=0;i<n;i++)
  {
      if(x[i]>=av)
       count++;
  }
  System.out.println(count);
  }
}
