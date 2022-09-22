import java.util.Scanner;
class Reve
{
    public static void main(String args[])
    {
        int n,res=0,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n!=0)
        {
            r=n%10;
            res=res*10+r;
            n=n/10;
        }
        System.out.println(res);
    }
}