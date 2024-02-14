import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.println("Calculator:-");
                // Taking input for two numbers
                System.out.print("Enter the first number: ");
                int num1 = scanner.nextInt();
                System.out.print("Enter the second number: ");
                int num2 = scanner.nextInt();
                int add,sub,multi;
                double div,mod;
                System.out.println("Results:");
                // Performing operations
                System.out.println("1. Addition (+)");
                add = num1 + num2;
                System.out.println(add);
                System.out.println("2. Subtraction (-)");
                sub = num1 - num2;
                System.out.println(sub);
                System.out.println("3. Multiplication (*)");
                multi = num1 * num2;
                System.out.println(multi);
                System.out.println("4. Division (/)");
                div = num1 / num2;
                System.out.println(div);
                System.out.println("5. Modulo (%)");
                mod = num1 % num2;
                System.out.println(mod);

            }
        }