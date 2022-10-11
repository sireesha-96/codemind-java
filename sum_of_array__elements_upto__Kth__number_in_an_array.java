import java.util.Scanner;
class Frequency {



   public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n,i,j,x[],k,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
            x[i]=sc.nextInt();
            k=sc.nextInt();
        for(i=0;i<k;i++)
        
        {  
           
         
             sum=sum+x[i];
      
        }
        System.out.println(sum);
   }
}
        
            
    