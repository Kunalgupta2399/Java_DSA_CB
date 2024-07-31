public class Binary_search {

    // Itreative code for Binary Search

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        BS(arr, 100);
    }

    static void BS(int [] arr , int target){
        int low = 0;
        int high = arr.length-1;

        while (low <= high) {
            int mid = (low+ high)/2;

            if (target == arr[mid]) {
                System.out.println(mid);
                break;
            }else if (target > arr[mid]){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
    }
    
}
