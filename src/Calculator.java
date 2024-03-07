import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand1 = scanner.nextInt();
        int operand2 = scanner.nextInt();
        char operation = scanner.next().charAt(0);
        int result ;
        switch (operation) {
            case '+':
                result = operand1 + operand2;
                System.out.println(result);
                break;
            case '-':
                result = operand1 - operand2;
                System.out.println(result);
                break;
            case '*':
                result = operand1 * operand2;
                System.out.println(result);
                break;
            case '/':
                result = operand1 / operand2;
                System.out.println(result);
                break;
            default:
                System.out.println("Error");
        }
    }
}