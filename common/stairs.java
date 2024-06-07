class stairs {
    public int climbStairs(int n) {

    int prev = 1;
        int prev2 = 1;//2
      
        for (int i = 2; i <= n; i++) {
            int curr = prev + prev2;
            prev2 = prev;//1
            prev = curr;//2
        }
        return prev;
    }

public static void main(String args[])
{
    stairs s=new stairs();
    System.out.println(s.climbStairs(3));
}
}