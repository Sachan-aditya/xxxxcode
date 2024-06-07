package kilo;
import java.util.Scanner;

public class bitwise {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        System.out.println("or"+(n|p));//or operation +
        System.out.println("and"+(n&p));// and for last bit even -0 odd -1 *
        System.out.println("xor"+(n^p));//xor // differnet -1
System.out.println("not"+(~n));//not operation //first bit =set bit ( o+ve ) 1-ve  and in case of 3
// ~(0011)= 1100 here 1 means negative first bit so - adn the 4=100 m so -4 basically it performs 2`s complement
// ~(0011)=1100 so now again ~(1100)= -01011+1 (for 2`s complemetn we add 1 , ), so it becomes -4 
        sc.close();
    }
    
}
