package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int element=list.get(0);
        System.out.println(list);
        System.out.println(element);

    }
    
}
