import java.util.Scanner;
class Adam
{
    public static void main(String args[])
    {
        int n,s1,s2,res1=0,res2=0,r1,r2;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        s1=n*n;
        while(n>0)
        {
            r1=n%10;
            res1=res1*10+r1;
            n=n/10;
        }
        s2=res1*res1;
        while(s2>0)
        {
            r2=s2%10;
            res2=res2*10+r2;
            s2=s2/10;
        }
        if(s1==res2)
         System.out.println("True");
        else
         System.out.println("False");
    }
}