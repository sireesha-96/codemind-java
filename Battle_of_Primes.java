import java.util.Scanner;
class Prime
{
    public static boolean prime(int n)
    {
        int c=0,i;
        for(i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
             c++;
        }
        if(c==0)
         return true;
        else
         return false;
    }
    public static void main(String args[])
    {
        int s,r=0,n1,n2;
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        s=n1+n2;
        for(int i=s+1; ;i++)
        {
            r++;
            if(prime(i))
             break;
        }
        System.out.println(r);
    }
}