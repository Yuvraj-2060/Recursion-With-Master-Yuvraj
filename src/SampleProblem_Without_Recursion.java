public class SampleProblem_Without_Recursion {
    public static void main(String[] args) {
        msg1(1);
    }
    static void msg1(int n){
        System.out.println(n);
        msg2(2);
    }
    static void msg2(int n){
        System.out.println(n);
        msg3(3);
    }
    static void msg3(int n){
        System.out.println(n);
        msg4(4);
    }
    static void msg4(int n){
        System.out.println(n);
        msg5(5);
    }
    static void msg5(int n){
        System.out.println(n);
    }

}

