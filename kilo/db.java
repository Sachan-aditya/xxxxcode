package kilo;
public class db {
    public static void main(String[] args) {
      
       
        int[] d = new int[100]; // Provide the size of the array
        int a = 10;
        int index = 0;
        long start=System.nanoTime();
        while (a > 0) {
            d[index++] = a % 2;
            a = a / 2;
        }

        for (int i = index - 1; i >= 0; i--) { // Start from the last index to print the array in reverse order
            System.out.print( d[i]);
            System.out.println();

        }
      
        long end=System.nanoTime();
        System.out.print(end-start);
    }
    //string s="";
    //string p=rem+s;//for reversal
}//not optimised