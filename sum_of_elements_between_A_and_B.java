import java.util.Scanner;
class Frequency {



   public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n,i,j,x[],a,b,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
            x[i]=sc.nextInt();
            a=sc.nextInt();
            b=sc.nextInt();
        for(i=0;i<n;i++)
        {  
            if(x[i]>=a&&x[i]<=b)
            {
                sum=sum+x[i];
            }
        }
        System.out.println(sum);
   }
}
            