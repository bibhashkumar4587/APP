import java.util.*;

public class EqualStackHeight {
    public static void main(String[] args) {
        int[] stack1 = {3, 2, 1, 1, 1};
        int[] stack2 = {4, 3, 2};
        int[] stack3 = {1, 1, 4, 1};

        System.out.println("Maximum possible height where all stacks are equal: " + equalizeStacks(stack1, stack2, stack3));
    }

    public static int equalizeStacks(int[] stack1, int[] stack2, int[] stack3) {
        int height1 = Arrays.stream(stack1).sum();
        int height2 = Arrays.stream(stack2).sum();
        int height3 = Arrays.stream(stack3).sum();
        int i = 0, j = 0, k = 0;
        while (true) {
            if (height1 == height2 && height1 == height3) {
                return height1;
            }
            if (height1 >= height2 && height1 >= height3) {
                height1 -= stack1[i++];
            } else if (height2 >= height1 && height2 >= height3) {
                height2 -= stack2[j++];
            } else if (height3 >= height1 && height3 >= height2) {
                height3 -= stack3[k++];
            }
        }
    }
}
