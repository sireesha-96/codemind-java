import java.util.Scanner;
class Rev
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String temp="";
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            temp=ch+temp;
        }
        System.out.println(temp);
    }
}