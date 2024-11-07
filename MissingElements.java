public class MissingElements {
    public static int[] findMissingElements(int[] array1, int[] array2) {

        int[] tempResult = new int[array2.length];
        int count = 0;
        for (int num2 : array2) {
            boolean isMissing = true;
            for (int num1 : array1) {
                if (num2 == num1) {
                    isMissing = false;
                    break;
                }
            }
            if (isMissing) {
                tempResult[count++] = num2;
            }
        }
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = tempResult[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 3, 4, 5, 6, 7 };
        int[] missingElements = findMissingElements(array1, array2);

        System.out.print("Missing elements from array1 in array2: ");
        for (int num : missingElements) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
