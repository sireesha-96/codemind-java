import java.util.Scanner;
class Ugly
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int inputNumber=sc.nextInt();
        checkUgly(inputNumber);
    }
    public static void checkUgly(int inputNumber)
    {
        int num=inputNumber;
        while(num!=1)
        {
            if(num%2==0)
             num/=2;
            else if(num%3==0)
             num/=3;
            else if(num%5==0)
             num/=5;
            else
            {
             System.out.println("Not Ugly Number");
             return;
              }
           }
            System.out.println("Ugly Number");
       }    
    }

