import java.util.Scanner;

public class FiboSeries {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n to calculate Fibonacci series: ");
        int n = scanner.nextInt();

        //Iterative Approach
        System.out.println("Fibonacci series (iterative):");
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }

        System.out.println("\n\nFibonacci series (recursive):");
        for (int i = 0; i < n; i++) {
            System.out.print(calculateFibonacciRecursive(i) + " ");//Method Calling for recursion
        }
    }

    //Recursive Approach
    private static int calculateFibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calculateFibonacciRecursive(n - 1) + calculateFibonacciRecursive(n - 2);
        }
    }
}
