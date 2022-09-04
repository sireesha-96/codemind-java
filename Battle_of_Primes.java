import java.util.Scanner;
class Prime
{
    public static boolean prime(int n)
    {
        int count=0,i;
        for(i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
             count++;
        }
        if(count==0)
         return true;
        else
         return false;
        }
        public static void main(String args[])
        {
            int s,c=0,n1,n2;
            Scanner sc=new Scanner(System.in);
            n1=sc.nextInt();
            n2=sc.nextInt();
            s=n1+n2;
            for(int i=s+1; ;i++)
            {
                c++;
                if(prime(i))
                 break;
            }
                System.out.println(c);
        }
    }