import java.util.Scanner;
class fibonacci
{
    public static void main(String args[])
    {
        int a=0,b=1,c,temp=0;
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=0; ;i++)
        {
            c=a+b;
            a=b;
            b=c;
            if(c>n)
            {
                temp=a;
                c=a+b;
                a=b;
                b=c;
                if((n-temp)<(a-n))
                System.out.println(temp);
                else if((n-temp)==(a-n))
                System.out.println(temp+" "+a);
                else if((n-temp)>(a-n))
                System.out.println(a);
                break;
            }
        }
    }
}