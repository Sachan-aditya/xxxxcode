package kilo;

class du {
    public boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }
}//16 -10000  & 15--> 1111 ==00000