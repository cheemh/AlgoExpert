package numbers;

public class Multiples {

    public static final int MAX_LIMIT=1000;

    public static void main(String[] args)
    {
        findAndPrintMultiples();
    }

    private static void findAndPrintMultiples() {
        int num1=3;
        int num2=5;
        int i=3;
        int sum=0;

        while(i < MAX_LIMIT)
        {
            if(i%3 == 0 || i%5 == 0)
            {
                System.out.print(i + ",");
                sum = sum+i;
            }
            i++;
        }
        System.out.println(" ");
        System.out.println("The sum is : " + sum);
    }
}
