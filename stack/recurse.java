import java.util.* ;
import java.io.*; 
public class Solution 
{
  public static Stack<Integer> pushAtBottom(Stack <Integer> mystack, int x) 
  {
    if(mystack.isEmpty())
    {
    mystack.push(x);
    return mystack;
    }
    int num=mystack.pop();
   mystack= pushAtBottom(mystack, x);
   mystack.push(num);
   return mystack;
  }
}
