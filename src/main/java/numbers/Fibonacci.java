package numbers;

public class Fibonacci {

    static final int MAX=4000000;

    public static void main(String[] args)
    {
        printFibonacci();
    }

    private static void printFibonacci() {
        int num1=1;
        int num2=2;
        int sum=2;

        int tmp;
        System.out.print(num1 + "," + num2 + ",");
boolean flag = true;
       while(flag)
        {
            tmp = num1+num2;
            System.out.print(tmp + ",");
            num1=num2;
            num2=tmp;

            if(tmp%2 == 0)
            {
                sum = sum+tmp;
                if(sum<MAX)
                    flag = true;
                else
                    flag = false;
            }
        }

        System.out.println("The Sum is : " + sum);

    }
}
