import java.util.Scanner;
class GFG
{
static int decideWinner(int []a, int n)
{
    int count0 = 0;
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    for (int i = 0; i < n; i++)
    {
        if (a[i] % 4 == 0)

            count0++;
        else if (a[i] % 4 == 1)
            count1++;
        else if (a[i] % 4 == 2)
            count2++;
        else if (a[i] % 4 == 3)
            count3++;
    }
    if (count0 % 2 == 0 && count1 % 2 == 0 && 
        count2 % 2 == 0 && count3 == 0)
        return 1;
    else
        return 2;
}
public static void main(String args[])
{

    int x[],n,i;
    Scanner sc=new Scanner(System.in);
    n= sc.nextInt();
    x=new int[n];
    for( i=0;i<n;i++)
     x[i]=sc.nextInt();
    for(i=0;i<n;i++)
    {
    if (decideWinner(x, n) == 1)
    {
  
        System.out.print("X");
        break;
    }
    else
       {
        System.out.print("Y");
        break;
       }
    }
}
}
 
