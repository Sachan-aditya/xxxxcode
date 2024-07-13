package strings;

public class builder {
    public static void main(String[] args) {
        
    
    StringBuffer sb=new StringBuffer("NAVIAN");
    System.out.println(sb.capacity());
    //16- this keeps everything in heap and extra 16 spaces//hence create a buffer4
    System.out.println(sb.deleteCharAt(4));
    System.out.println(sb.insert(0,"Aditya"));
    System.out.println(sb.reverse());//chnnages are directly made to string
    System.out.println(sb.substring(5));
    System.err.println(sb);
    System.out.println(sb.substring(3,7));//start from 3 end before 7
    System.out.println(sb.hashCode());
    System.out.println(sb.length());//6
    // IT IS THREAT SAFE THAN STRING BUILDER
    
}
}
