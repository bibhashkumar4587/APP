public class QuickSort {
  public static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low - 1;
    for (int j = low; j < high; j++) {
      if (arr[j] <= pivot) {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return i + 1;
  }

  private static void printArray(int[] arr) {
    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      if (i < arr.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println("]");
  }

  public static void main(String[] args) {
    int[] arr = { 10, 80, 30, 90, 40, 50, 70 };
    int low = 0;
    int high = arr.length - 1;
    System.out.print("Original array: ");
    printArray(arr);
    int pivotIndex = partition(arr, low, high);
    System.out.print("Array after partitioning with pivot index " + pivotIndex + ": ");
    printArray(arr);
  }
}
