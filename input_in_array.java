import java.util.Scanner;
public class abc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[5];

        System.out.println("Please enter 5 Names:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Name : " + (i + 1) + ": ");
            arr[i] = scanner.next();
        }
        System.out.println("Name is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // Reverse the element of array
        System.out.println("Reverse of element: ");
        for(int i=arr.length-1;i>=0;i--)
        {
                System.out.println(arr[i]); 
        }
    }
}
