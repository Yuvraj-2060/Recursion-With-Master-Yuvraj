public class SampleProblem_Recursion {
    public static void main(String[] args) {
        msg(5);
        System.out.println("\n***********\n");
        revMsg(5);
    }
    static void msg(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        msg(n-1);
    }
    static void revMsg(int n){
        if(n==0){
            return;
        }
        revMsg(n-1);
        System.out.println(n);
    }

}
