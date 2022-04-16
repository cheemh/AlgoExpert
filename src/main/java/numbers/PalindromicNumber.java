package numbers;

public class PalindromicNumber {
    public static void main(String[] args) {
        maxPalindrome();
    }

    private static void maxPalindrome() {
    isPalindrome(981189);
    }

    private static void isPalindrome(int n) {
        String s = String.valueOf(n);
        char[] arr = s.toCharArray();
        int j=arr.length-1;
        boolean isPalindrome = true;
        for(int i=0;i<j;i++,j--)
        {
            if(arr[i] != arr[j])
            {
                isPalindrome=false;
                break;
            }
        }
        if(!isPalindrome)
            System.out.println("Number is not a Palindrom : " + n);
        else
            System.out.println("Number is a Palindrome : " + n);
    }
}
