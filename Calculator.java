import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: " + "\n");
        double num1 = sc.nextDouble();

        System.out.print("Enter the operator(+, -, *, /): " + "\n" + num1);
		char operator=sc.next().charAt(0);
		
		System.out.print("Enter the second number: " + "\n" + num1 + operator);
        double num2 = sc.nextDouble();

        

        double result = 0.0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + "\n" + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + "\n" + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + "\n" + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + "\n" + result);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
