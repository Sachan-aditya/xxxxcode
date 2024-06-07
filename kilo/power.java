package kilo;
public class power {
        public static void main(String args[])
        {
            System.out.println(calculatePower(5,3));
        }
        public static int calculatePower(int n,int x)
        {
                if(x==0)
                return 1;
                if(x==1)
                return n;
            else 
                return n*calculatePower(n,x-1);
        }
}
