import java.util.Scanner;
class Disarium
{
    public static void main(String args[])
    {
        int n,len,sum=0,r,temp;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
        len=(int)Math.log10(n)+1;
        while(len!=0)
        {
            r=n%10;
            sum=sum+(int)Math.pow(r,len);
            n=n/10;
            len--;
        }
        if(temp==sum)
         System.out.println("True");
        else
         System.out.println("False");
    }
}