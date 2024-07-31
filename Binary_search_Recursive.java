/**
 * Binary_search_Recursive
 */
public class Binary_search_Recursive {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9};
        BS_Recursive(arr, 0, arr.length-1, 5);
    }

    static int BS_Recursive( int arr[] , int low, int high , int target){

        if ( low > high) return -1;
        int mid = (low + high) /2;
        if (arr[mid] == target) {
            return mid;
        }else if (target > arr[mid]) {
            return BS_Recursive( arr  ,mid +1 ,high, target );
        }
             return BS_Recursive(arr, low, high-1, target);
    }
     
}