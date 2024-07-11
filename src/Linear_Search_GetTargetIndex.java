import java.util.ArrayList;

public class Linear_Search_GetTargetIndex {
    public static void main(String[] args) {
        int arr[] = {5,6,1,2,4,4,7};

        System.out.println(getTargetIndex(arr, 0, 4));
        System.out.println(findAllIndex(arr, 0, 4));
    }

    private static ArrayList<Integer>  getTargetIndex(int[] arr, int i, int target) {
        ArrayList<Integer> ls = new ArrayList<>();

        ls = getTargetList(arr,i,target,ls);
        return ls;

    }
    // 1). By Passing ArrayList
    private static ArrayList<Integer> getTargetList(int[] arr, int index, int target, ArrayList<Integer> ls) {
        if(index==arr.length)
            return ls;
        if(arr[index]==target)
            ls.add(index);
        return getTargetList(arr, index+1, target, ls);
    }


    // 2). Without Passing The ArrayList
    private static ArrayList<Integer> findAllIndex(int[] arr, int index, int target) {
        ArrayList<Integer> ls = new ArrayList<>();
        if(index == arr.length)
            return ls;
        if(arr[index] == target)
            ls.add(index);

        ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr, index+1,target);
        ls.addAll(ansFromBelowCalls);

        return ls;
    }
}
