import java.util.Scanner;
class Pronic
{
    public static void main(String args[])
    {
        int n,s;
        Scanner sc=new Scanner (System.in);
        n=sc.nextInt();
        s=(int)Math.sqrt(n);
        if(n==(s*(s+1)))
         System.out.println("YES");
        else 
         System.out.println("NO");
    }
}
         
         
         
 