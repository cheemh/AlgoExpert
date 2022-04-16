package arrays;

public class SwapElements {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 9, 1, 2};
        int[] arr2 = {3, 5, 6, 1, 2};
        print(arr);
        swap(arr);
        print(arr);

        print(arr2);
        swap(arr2);
        print(arr2);
    }

    private static void print(int[] arr) {
        System.out.println("");
        for (int a : arr) {
            System.out.print(a + ", ");
        }
    }

    private static void swap(int[] arr) {
        int len = arr.length;
        int tmp = 0;
        for (int i = 0, j = len - 1; i < len / 2; i++, j--) {
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }
}

