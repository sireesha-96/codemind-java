import java.util.Scanner;
class Average
{
    public static void main(String args[])
    {
        int n,x[],i,sum=0;
        double ave=1;
        Scanner sc=new Scanner (System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
         x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            sum=sum+x[i];
            ave=sum/(float)n;
        }
        System.out.format("%.2f",ave);
    }
}