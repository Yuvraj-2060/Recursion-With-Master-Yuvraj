public class Rotated_Binary_Search {
    public static void main(String[] args) {
        int arr[] = {8, 11, 13, 15, 1, 4, 6};
        int target=4;

        System.out.println(searchIndex(arr, target, 0, arr.length-1));
    }

    private static int searchIndex(int[] arr, int target, int s, int e) {
        if(s>e)
            return -1;
        int m= s+(e-s)/2;

        if(arr[m]==target)
            return m;

        if(arr[s]<=arr[m]){ // This means left half is sorted
            if(target>=arr[s] && target<arr[m]){
                return searchIndex(arr, target, s, m-1);
            }
            else{
                return searchIndex(arr, target, m+1, e);
            }
        }
        if(target > arr[m] && target<=arr[e]){
            return searchIndex(arr, target, m+1, e);
        }
        return searchIndex(arr, target, s, m-1);
    }
}
