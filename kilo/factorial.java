package kilo;
import java.util.Scanner;


public class factorial {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  a number ");
        int n=sc.nextInt();int res=1;
        for(int i=n;i>=1;i--)
        {
         res=res*i;
            
        }
        System.out.println(res);
        sc.close();

    }
}
