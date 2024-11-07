    import java.util.Arrays;
    import java.util.Scanner;

    public class ShippingContainers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of items: ");
            int n = scanner.nextInt();
            int[] weights = new int[n];

            System.out.println("Enter the weights of the items: ");
            for (int i = 0; i < n; i++) {
                weights[i] = scanner.nextInt();
            }
            int containers = calculateMinimumContainers(weights);
            System.out.println("Minimum number of containers required: " + containers);

            scanner.close();
        }

        public static int calculateMinimumContainers(int[] weights) {
            Arrays.sort(weights);
            int containerCount = 0;
            boolean[] shipped = new boolean[weights.length];
            for (int i = 0; i < weights.length; i++) {
                if (shipped[i]) {
                    continue;
                }
                containerCount++;
                int minWeight = weights[i];
                int maxWeightLimit = minWeight + 4;
                shipped[i] = true;
                for (int j = i + 1; j < weights.length; j++) {
                    if (!shipped[j] && weights[j] <= maxWeightLimit) {
                        shipped[j] = true;
                    }
                }
            }
            return containerCount;
        }
    }
