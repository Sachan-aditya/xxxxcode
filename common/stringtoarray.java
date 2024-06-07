public class stringtoarray {
    
    public long appendCharacters(String s, String t) {
        long m = s.length();
        long n = t.length();
        long j = 0;

        char[] st= s.toCharArray();
        char[] tt = t.toCharArray();

        // Traverse char array s
        for (long i = 0; i < m && j < n; i++) {
            if (st[(int) i] == tt[(int) j]) {
                j++;
            }
        }

        // Number of characters to append to make t a subsequence of s
        return n - j;
    }
}
