import java.util.Scanner;

public class FibonacciSequence {
    public static void generateFibonacci(int n) {
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Sequence up to " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        generateFibonacci(n);

        scanner.close();
    }
}
