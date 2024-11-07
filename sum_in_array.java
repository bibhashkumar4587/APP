import java.util.Scanner;

public class sum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[5];
        int totalSum=0;

        System.out.println("Please enter 5 Integer:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
      for(int i=0;i<arr.length;i++)
      {
        totalSum=totalSum+arr[i];
      }
      System.out.println("Sum of element is :"+totalSum);
    }
}
