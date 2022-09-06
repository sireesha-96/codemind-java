import java.util.Scanner;
class Pail
{
    public static void main(String args[])
    {
        int n,r,res=0,temp;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
        while(n>0)
        {
            r=n%10;
            res=res*10+r;
            n=n/10;
        }
        if(temp==res)
         System.out.println("True");
        else
         System.out.println("False");
    }
}