import java.util.Scanner;
class Coin {
    static void Winner(int m, int n)
    {
        if (m % 2 == 0 || n % 2 == 0)
            System.out.println("Player 1");
        else
            System.out.println("Player 2");
    }
    public static void main (String args[])
    {
        int m,n;
        Scanner sc=new Scanner (System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        Winner(m,n);
    }
}

  
 