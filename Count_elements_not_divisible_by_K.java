import java.util.Scanner;
class Array
{
    public static void main(String args[])
    {
        int n,x[],i,k,c=0;
        Scanner sc=new Scanner (System.in);
        n=sc.nextInt();
        x=new int[n];
        k=sc.nextInt();
        for(i=0;i<n;i++)
         x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if((x[i]%k)!=0)
             c++;
        }
        System.out.println(c);
    }
}