import java.util.* ;
public class atlast 
{
  public static Stack<Integer> pushAtBottom(Stack <Integer> mystack, int x) 
  {
    Stack<Integer> temp=new Stack<>();
    while(!mystack.isEmpty())
      temp.push(mystack.pop());
      temp.push(x);

    while(!temp.isEmpty())
    {
      mystack.push(temp.pop());
    }
    return mystack;
  }
}
