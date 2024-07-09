public class Sorted {
    public static void main(String[] args) {
        int arr1[] = {7,2,1,5,10,6};
        int arr2[] = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Array After Sorting: "+sorted(arr1,0));
        System.out.println("Array After Sorting: "+sorted(arr2,0));
    }
    static  boolean sorted(int arr[], int index){
        if(index==arr.length-1)
                return true;
        return arr[index]<arr[index+1] && sorted(arr, index+1);

    }
}
