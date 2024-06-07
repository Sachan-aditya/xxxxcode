package kilo;
import java.util.*;
public class printback
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.print(back(n));
        sc.close();
    }
    public static int back(int n)
    {
        if(n<=1)
        return 1;
        else
        System.out.print(n);
        return (back(n-1));
    }
}
