
// a calculator that can perform 4 user-selected operations with 2 entered numbers
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("number 1: ");
        int a = scan.nextInt();
        System.out.println("number 2: ");
        int b = scan.nextInt();
        System.out.println("select process: ");
        System.out.println("1-addition");
        System.out.println("2-subtraction");
        System.out.println("2-multiplication");
        System.out.println("2-division");
        int select = scan.nextInt();
        double result = 0;
        switch (select) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                result = a / b;
                break;
            default:
                System.out.println("Enter valid number.");
        }
        System.out.println("Result: " + result);

    }
}
