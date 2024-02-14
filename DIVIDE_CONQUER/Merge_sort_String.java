/* apply merge sort to sort an array of String. (Assume that all the character 
in all the strings are in lowercase). */
package DIVIDE_CONQUER;

public class Merge_sort_String {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Merge_string(int arr[] , int si , int ei){
        if(si >= ei){
            return ;
        }

        int mid = si + (ei-si)/2;
        Merge_string(arr, si, mid); // left part
        Merge_string(arr, mid+1, ei); // right part
        merged(arr, si, mid, ei);

    }

    public static void merged(int arr[] , int si, int mid , int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }    

            while(i <= mid){
                temp[k++] = arr[i++];
            }

            while(j <= ei){
                temp[k++] = arr[j++];
            }

        
        for(k=0 ,i=si; k<temp.length;  i++ ,k++){
            arr[i] = temp[k];
        }

    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        int arr[] = {4,9,56,23,0,68};
        Merge_string(arr, 0, arr.length-1);
        System.out.println("the merged sort string is -> ");
        printArr(arr);

    }
}
