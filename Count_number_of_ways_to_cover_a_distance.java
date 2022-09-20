import java.util.Scanner;
class count
{
static int count(int n)
{
    if (n == 0)

        return 1;

    if (n <= 2)

        return n;

    int f0 = 1, f1 = 1, f2 = 2;

    int a=0;

    for (int i = 3; i <= n; i++) 

    {

        a= f0 + f1 + f2;

        f0 = f1;

        f1 = f2;

        f2 = a;
    }

    return a;
}
 


public static void main (String[] args) 
{
    int n;
    Scanner sc=new Scanner (System.in);
    n=sc.nextInt();
    System.out.println(count(n));
  }
}
