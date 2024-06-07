package kilo;
import java.util.*;
public class even {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in) ;
             long n=sc.nextLong();
             Long start=System.nanoTime();
        if ((n & 1) == 0) {
            
              
                System.out.println(n + " is even");
            } else {
                System.out.println(n + " is odd");
            }
            Long end=System.nanoTime();
            System.err.println("time required"+(end-start));
            sc.close();
         }
    }
// checck for last digit , for odd it is 1 and for even it is 0
// 10 -1010 & 1 = and results 1 only when both are 1 . so 1*0 =0 , hence it it even