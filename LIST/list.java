package LIST;

import java.util.*;

public class list {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(60);
        list.add(2, 25);
        list.add(40);
        System.out.println(list);
    }
}