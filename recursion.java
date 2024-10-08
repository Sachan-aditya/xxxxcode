public class recursion {

    public int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public int powerofx(int n, int x) {
        if (x == 0) {
            return 1;
        }
        if (x == 1) {
            return n;
        }
        return n * powerofx(n, x - 1);
    }

    public int fibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        Recursion recursion = new Recursion();

        System.out.println("Factorial of 5: " + recursion.fact(5));
        System.out.println("Power of 2 to the 3: " + recursion.powerofx(2, 3));
        System.out.println("Fibonacci of 8: " + recursion.fibo(8));
    }
}