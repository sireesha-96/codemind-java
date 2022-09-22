import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        int t,a,b,c=0;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            c=a+b;
            System.out.println(c);
            t--;
        }
    }
}