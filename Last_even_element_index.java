import java.util.Scanner;
class Even
{
    public static void main(String args[])
    {
        int n,x[],i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            
        }
        for(i=n-1;i>=0;i--)
        {
            if(x[i]%2==0)
            {
              System.out.println(i);
              break;
            }
        }
    }
}
