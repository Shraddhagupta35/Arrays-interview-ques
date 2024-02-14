 /* search in rotated sorted array--  input-> sorted, rotatd array with distinct number (in ascending order) . 
 it is rotated at a pivot point . find the index of given element.
  */
package DIVIDE_CONQUER;

public class rotated_sorted {
    public static int search_targetArray(int arr[] , int si, int target, int ei){
        // base case

        if(si > ei){
            return -1 ; // agar array mai target exit hi nhi krti to invalid index return krega
        }
           // kaam
        int mid = si + (ei - si)/2;

        // random search ki target mid pr hai
        if(arr[mid] == target){
            return mid;
        }


        // mid on L1
        if(arr[si] <= arr[mid]){
            // case a: left
            if(arr[si] <= target && target <= arr[mid]){
                return search_targetArray(arr, si, target, mid-1);
            }else{
                // casse b: right
                return search_targetArray(arr, mid+1, target, ei);

            }
        }

        // mid on L2
        else{
            // case c: right
            if(arr[mid] <= target && target <= arr[ei]){
                return search_targetArray(arr, mid+1, target, ei);
            }else{
                // case d: left
                return search_targetArray(arr, si, target, mid-1);
            }
        }     
    }
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int indx = search_targetArray(arr, 0, target, arr.length-1);
        System.out.println("the target exit on index -> " + indx );

    }
}
