import java.util.Scanner;
class Array1
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int n,i,x[],sum=0,count=0;
  float ave;
  n=sc.nextInt();
  x=new int[n];
  for ( i=0;i<n;i++)
  {
   x[i]=sc.nextInt();
  }
  for( i=0;i<n;i++)
  {
   sum=sum+x[i];
  }
   ave=sum/n;
   for(i=0;i<n;i++)
   {  
     if(x[i]<=ave)
      count++;
   }
      System.out.println(count);
 }
}
