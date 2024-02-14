package DIVIDE_CONQUER;

public class Merge_sort_integeter {

    // to print arr
    public static void printARR(int arr[] ){
        for(int i=0; i<arr.length; i++){
            System.out.print( arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[] , int si, int ei){
        // base case
        if(si >= ei){
            return;
        }

        // recursive kaam

        int mid = si + (ei - si)/2;
        mergeSort(arr, 0, mid);  // left part divide
        mergeSort(arr , mid+1 , ei); // right part divide
        merged(arr , si , mid , ei); // to merge left and right part

    }
        public static void merged(int arr[] , int si , int mid , int ei){
            // suppose temp arr = 7 to isiliye ei-si+1 kiya gya taki ans sahi de
            // left(0,3)= 4 , right(4,6)=3  --> 6-0+1=7

            int temp[] = new int[ei-si+1];  // to initialize temp array size
            int i = si; // iterator for left part
            int j = mid+1; // iterator for right part
            int k = 0; // because temp value is 0 idx start
        
            //
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

            // left part mein bache element
            while(i <= mid){
                temp[k++] = arr[i++];

            }

            // right part
            while(j <= ei){
                temp[k++] = arr[j++]; 
            }

            // to copy original temp value
            for(k=0 , i=si ; k<temp.length; i++ , k++){
                   arr[i] = temp[k];

            }          
        }
    

    public static void main(String[] args){
        int arr[] = {6,8,3,9,1,5,-2};
        mergeSort(arr, 0, arr.length-1);
       System.out.println("the merge sort array is --> ");
       printARR(arr);
        
        
    }
}
  
