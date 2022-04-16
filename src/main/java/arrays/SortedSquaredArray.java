package arrays;

public class SortedSquaredArray {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 7, 9, 5};
        printArray(arr);
        printArray(arr);
        printArray(squareArray(sortArray(arr)));
    }

    private static void printArray(int[] arr) {
        System.out.println(" ");
        for (int a : arr)
            System.out.print(a + ",");
    }

    private static int[] squareArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        return arr;
    }

    private static int[] sortArray(int[] origArr) {
        int tmp;
        int len = origArr.length;
        int copyArray[] = new int[len];
        boolean furtherIteration = false;

        for (int i = 0; i < len; i++)
            copyArray[i] = origArr[i];

        do {
            // sorting incoming array
            furtherIteration = false;
            for (int prev = 0, next = 1; next < copyArray.length; prev++, next++) {
                if (copyArray[prev] <= copyArray[next])
                    continue;
                else {
                    tmp = copyArray[prev];
                    copyArray[prev] = copyArray[next];
                    copyArray[next] = tmp;
                    furtherIteration = true;
                }
            }
        } while (furtherIteration == true);

        return copyArray;
    }
}
