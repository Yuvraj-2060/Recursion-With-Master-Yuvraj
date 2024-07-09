public class Plaindrome_Number {
    public static void main(String[] args) {
        int n=9998;
        //int n = 1212121;
        int ans= revNumber(n);
        if(n==ans)
            System.out.println("Number is palindrome");
        else
            System.out.println("Number is not palindrome");

    }
    static int revNumber(int num){
        int digit =(int)Math.log10(num);
        return helper(num, digit);
    }
    private static int helper(int num, int digit) {
        if(num%10 == num)
            return num;
        int rem = num%10;
        return rem* (int)Math.pow(10,digit) + helper(num/10, digit-1);
    }
}
