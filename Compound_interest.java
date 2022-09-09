import java.util.Scanner;
class Compound
{
 public static void main(String args[])
 {
  int p,r,t;
  double c;
  Scanner sc=new Scanner(System.in);
  p=sc.nextInt();
  r=sc.nextInt();
  t=sc.nextInt();
  c=p*Math.pow((1+(float)r/100.0),t);
  System.out.format("%.2f",c);
  }
}