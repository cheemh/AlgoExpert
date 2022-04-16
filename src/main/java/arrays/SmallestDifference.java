package arrays;

public class SmallestDifference {
    public static void main(String[]args)
    {
        int[] arrayOne = {-1,5,10,20,28,3};
        int[] arrayTwo = {26,134,135,15,17};

        int[] arrOne = sortIntArray(arrayOne);
        int[] arrTwo = sortIntArray(arrayTwo);

        printArray(arrOne);
        printArray(arrayTwo);

        printArray(smallestDifference(arrOne,arrTwo));
    }

    public static int[] smallestDifference(int[]arrOne, int[] arrTwo)
    {
        int len1 = arrOne.length;
        int len2 = arrTwo.length;

        int[] outerArr;
        int[] innerArr;
        boolean flag = false;

        if(len1 >= len2) {
            outerArr = arrOne;
            innerArr = arrTwo;
            flag = true;
        }
        else{
            outerArr = arrTwo;
            innerArr = arrOne;
            flag = false;
        }

        int diff;
        int smallestDiff=0;
        int[] smallestDiffArr = new int[2];
        boolean start = false;

        for(int i=0; i<outerArr.length;i++)
        {
            start = true;

            for(int j=0; j<innerArr.length;j++)
            {
                if(start == true)
                {
                    smallestDiff = Math.abs(outerArr[i] - innerArr[j]);
                    if(flag == true) {
                        smallestDiffArr[0] = outerArr[i];
                        smallestDiffArr[1] = innerArr[j];

                    }else
                    {
                        smallestDiffArr[0] = innerArr[i];
                        smallestDiffArr[1] = outerArr[j];
                    }

                    start = false;
                    continue;
                }
                diff = Math.abs(outerArr[i] - innerArr[j]);
                if(smallestDiff >= diff)
                {
                    smallestDiff = diff;

                    if(flag == true) {
                        smallestDiffArr[0] = outerArr[i];
                        smallestDiffArr[1] = innerArr[j];

                    }else
                    {
                        smallestDiffArr[0] = innerArr[i];
                        smallestDiffArr[1] = outerArr[j];
                    }
                }

                System.out.println("The Difference : " + outerArr[i] + "," + innerArr[j] + " = " + Math.abs(diff));
            }
        }


        return smallestDiffArr;
    }

    private static void printArray(int[] arrOne) {
        System.out.println(" ");
        for(int a: arrOne)
        {
            System.out.print(a+",");
        }
    }

    private static int[] sortIntArray(int[] origArr) {
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
        return copyArray;
    }
}