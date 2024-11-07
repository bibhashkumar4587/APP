import java.util.Scanner;

public class MarcCupcakeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCupcakes = 0; 
        double totalCalories = 0;
        while (true) {
            System.out.print("Enter the calories of the cupcake Marc just ate (or type -1 to exit): ");
            int cupcakeCalories = scanner.nextInt();
            if (cupcakeCalories == -1) {
                break;
            }
            totalCupcakes++;
            totalCalories += cupcakeCalories;
            double requiredWalkingDistance = 2 * totalCupcakes; 
            System.out.printf("Marc has eaten %d cupcakes. Total calories: %.2f.\n", totalCupcakes, totalCalories);
            System.out.printf("To maintain his weight, Marc must walk at least %.2f cmiles.\n\n", requiredWalkingDistance);
        }
        System.out.println("Thank you for using the Cupcake Calorie Tracker. Goodbye!");
        scanner.close();
    }
}
