package Project;
import java.util.Scanner;
public class calulator {
    public static void main(String args[]){
    @SuppressWarnings("resource")
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two number");
    int n=sc.nextInt();
    int b=sc.nextInt();
   System.out.println("Enter the Character");
   String s=sc.next();
   char c=s.charAt(0);
   switch (c) {
    case '+':
    System.out.println("Addition of two number is "+(n+b));
        
        break;
        case '-':
        System.out.println("Subtaction of two number is "+(n-b));
            
            break;
            case '*':
            System.out.println("Multipication of two number is "+(n*b));
                
                break;
                case '/':
                System.out.println("Division of two number is "+(n/b));
                    
                    break;
   
    default:
    System.out.println("Invalid Output");
        break;
   }
    }
    
}
