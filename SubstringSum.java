import java.util.Scanner;

public class SubstringSum {
    static final int MOD = 1000000007;

    public static long sumOfSubstrings(String number) {
        int n = number.length();
        long sum = 0; 
        long currentContribution = 0;

        // Traverse the number from left to right
        for (int i = 0; i < n; i++) {
            // Convert the character to its integer value
            int digit = number.charAt(i) - '0';

            // Update the contribution of current digit to the sum of substrings
            currentContribution = (currentContribution * 10 + digit * (i + 1)) % MOD;

            // Add current contribution to total sum
            sum = (sum + currentContribution) % MOD;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = scanner.nextLine();

        // Calculate the sum of all substrings
        long result = sumOfSubstrings(number);

        System.out.println("Sum of all substrings modulo 10^9 + 7: " + result);
        scanner.close();
    }
}
