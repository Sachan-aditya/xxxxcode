package Project;

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Calc");
        boolean exit = false;
        do {
            System.out.println("Enter the Character:(* / + -)");
            char ch = sc.next().charAt(0);
            if (ch != '+' && ch != '-' && ch != '*' && ch != '/') {
                System.out.println("Wrong Input");
            } else {
                operation(ch, sc);
            }
            exit = exitProgram(sc);
        } while (!exit);
        System.out.println("Thanks for using Calc");
    }

    public static boolean exitProgram(Scanner sc) {
        System.out.println("Do you want to continue? (y/n)");
        char ch = sc.next().charAt(0);
        if (ch == 'n' || ch == 'N') {
            return true;
        } else if (ch == 'y' || ch == 'Y') {
            return false;
        } else {
            System.out.println("Wrong input, please try again");
            return exitProgram(sc);
        }
    }

    public static void operation(char c, Scanner sc) {
        switch (c) {
            case '+':
                int num1 = getInteger(sc);
                int num2 = getInteger(sc);
                System.out.println("Addition of two number is " + (num1 + num2));
                break;
            case '-':
                int num3 = getInteger(sc);
                int num4 = getInteger(sc);
                System.out.println("Subtraction of two number is " + (num3 - num4));
                break;
            case '*':
                int num5 = getInteger(sc);
                int num6 = getInteger(sc);
                System.out.println("Multiplication of two number is " + (num5 * num6));
                break;
            case '/':
                int num7 = getInteger(sc);
                int num8 = getInteger(sc);
                if (num8 == 0) {
                    System.out.println("Divide by Zero Error");
                } else {
                    System.out.println("Division of two number is " + (num7 / num8));
                }
                break;
            default:
                System.out.println("Unknown Operation");
                break;
        }
    }

    public static int getInteger(Scanner sc) {
        System.out.println("Enter a number");
        int n = sc.nextInt();
        return n;
    }
}