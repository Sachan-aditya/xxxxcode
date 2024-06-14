package LIST;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(30);
        vector.add(60);
        vector.add(2, 25);
        vector.add(40);
        System.out.println(vector);
    }
}
