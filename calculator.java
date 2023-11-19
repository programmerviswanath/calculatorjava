/*Task 1 : CALCULATOR 
 Create a basic calculator that can perform basic arithmetic operations such as 
 addition, subtraction, multiplication, and division.
*/

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        
        Scanner numb = new Scanner(System.in);
        char ch;
        do{
        System.out.println("---------------------");
        System.out.println("| JAVA CALCULATOR |");
        System.out.println("---------------------");

        double num1, num2, result;
        char operator;

        System.out.print("Enter first number: ");
        num1 = numb.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = numb.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = numb.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Denominator should not be ZERO.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }
        System.out.println("Do you want to perform another calculation? (y/n): ");
        ch = numb.next().charAt(0);
       }while(ch=='y' || ch=='Y');
       System.out.println("Calculator program terminated.");
    }
}
