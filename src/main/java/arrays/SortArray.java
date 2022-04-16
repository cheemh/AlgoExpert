package arrays;

public class SortArray {
    public static void main(String []args)
    {
        System.out.println("Sort an Array");
        SortArray obj = new SortArray();
        obj.callMethods();
    }

    private void callMethods() {
    int origArr [] = {10,7,3,3,5} ;
    sortIntArray(origArr);
    }

    private void sortIntArray(int[] origArr) {

        int tmp;
        int len = origArr.length;
        int copyArray[] = new int[len];
        boolean furtherIteration = false;
        // copy contents of intArray to copyArray
        for (int i=0; i<len; i++)
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
        }while(furtherIteration==true);

        System.out.println("Array is sorted");
    }
}
