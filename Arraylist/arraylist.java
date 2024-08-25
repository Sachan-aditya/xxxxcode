package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        int element=list.get(0);//index
        System.out.println(list);
        //inbetween
        list.add(2,4);
        System.out.println(list);
        //change 
        list.set(2,5);
        System.out.println(list);
// remove
list.remove(2);
System.out.println(list);
        System.out.println(element);
        System.out.println(list.size());
             for(int i=0;i<list.size();i++)
             {
                System.out.print(list.get(i));
             }
             Collections.sort(list);
             System.out.print(list);
    }
    
}
