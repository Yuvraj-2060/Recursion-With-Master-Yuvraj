public class Nth_Fibonacci_Recursion {
    public static void main(String[] args) {
        System.out.println("Nth Fibonacci Number Is : "+nFibbo(4));
    }
    static int nFibbo(int n){
        if(n<2)
            return n;
        return nFibbo(n-1) + nFibbo(n-2);
    }
}
