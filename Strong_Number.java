import java.util.Scanner;
class Strong
{
    public static void main(String args[])
    {
        int n,i,l,p;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0)
        {
            i=1;
            p=1;
            l=n%10;
            while(i<=l)
            {
            p=p*i;
            i++;
            }
            sum=sum+p;
            n=n/10;
        }
        if(temp==sum)
         System.out.println("The number " + temp + " is a strong number");
        else
         System.out.println("The number " + temp + " is not a strong number");
    }
}