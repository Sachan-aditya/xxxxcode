package common;
class wor {
    public int scoreOfString(String s) {
        int p = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int ch = (int) s.charAt(i);
            int ch1 = (int) s.charAt(i + 1);
            p += Math.abs(ch - ch1);
        }
        return p;
    }
}
