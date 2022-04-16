package arrays;

public class MoveElementToEnd {
    public static void main(String[] args) {
        int[] arr = {2, 7, 2, 7, 2, 3, 4, 2};
        int toMove = 7;

        arr = sortArray(arr);
        printArray(arr);
        moveElement(toMove, arr);
        printArray(arr);
    }

    private static void moveElement(int toMove, int[] arr) {
        int len = arr.length;
        int pos = 0;
        int tmp = 0;

        for (int i = 0, j = len - 1; i < arr.length;i++) {
            if (i > j)
                break;
            else if (arr[j] != toMove) {
                pos = j;
                if (arr[i] != toMove) {

                    continue;
                } else {
                    tmp = arr[pos];
                    arr[pos] = arr[i];
                    arr[i] = tmp;
                    j--;
                }
            }
        }
    }

    private static void printArray(int[] arr) {
        System.out.println(" ");
        for (int a : arr) {
            System.out.print(a + ",");
        }
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
