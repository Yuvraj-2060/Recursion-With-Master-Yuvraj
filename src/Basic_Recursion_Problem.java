public class Basic_Recursion_Problem {
    public static void main(String[] args) {
        int n1=5;
        int n2=5;
        int n3=3427;
        int n4=1234;

        System.out.println("Factorial of "+n1+" is "+factorial(n1));
        System.out.println("Sum of 1 to "+n2+" is "+sum(n2));
        System.out.println("SumofDigit of "+n3+" is "+digitSum(n3));
    }
    static int factorial(int n){
        if(n<=1)
            return 1;

        return n*factorial(n-1);
    }
    static int sum(int n){
        if(n<=1)
            return 1;

        return n+sum(n-1);
    }
    static int digitSum(int num){
        if(num==0)
            return 0;

        return num%10+ digitSum(num/10);
    }

}
