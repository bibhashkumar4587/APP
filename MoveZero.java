import java.util.*;
public class MoveZero {
  public static void main(String arg[])
  {
    int arr[] = {1};
    System.out.println(Arrays.toString(moveZeroes(arr)));
  }

  public static int[] moveZeroes(int arr[]) {
    int i = 1;
    int j = 0;
    while (i < arr.length) {
      if (arr[j] == 0 && arr[i] != 0) {
        swap(arr, i, j);
        i++;
        j++;
      } else if (arr[i] == 0 && arr[j] == 0) {
        i++;
      } else {
        i++;
        j++;
      }
    }
    return arr;
  }

  public static void swap(int arr[], int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

 
}



// public static int[] moveZeroes(int arr[]) {
//   int j=0;
//   for(int i=0;i<arr.length;i++)
//   {
//   if(arr[i]!=0)
//   {
//   arr[j]=arr[i];
//   j++;
//   }
//   }
//   for(int i=j;i<arr.length;i++)
//   {
//   arr[i]=0;
//   }
//   return arr;
//   }
  

