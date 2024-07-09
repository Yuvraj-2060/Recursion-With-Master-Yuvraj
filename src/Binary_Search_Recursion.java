public class Binary_Search_Recursion {
    public static void main(String[] args) {
        int arr[] ={-20, -10,0, 10, 15, 20, 35, 40, 45, 60, 70, 80, 100};
        int target = 33;

        System.out.println("Target Element : "+target+" found at INDEX : "+binarySearch(arr, target, 0, arr.length-1));

    }
    static int binarySearch(int[] arr, int target, int s,int e){
        if(s>e)
            return -1;
        int mid = s + (e-s)/2;

        if(arr[mid]==target)
            return mid;
        else if (arr[mid] < target)
           return binarySearch(arr, target, mid+1,arr.length-1);

        else
            return binarySearch(arr, target, s, mid-1);
    }
}
