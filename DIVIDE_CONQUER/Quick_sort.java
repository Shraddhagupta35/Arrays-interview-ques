package DIVIDE_CONQUER;
public class Quick_sort {

    public static void printarr(int arr[]){
        System.out.println("the sorted array -->");
    for(int i=0; i<=arr.length-1; i++){
        System.out.print(arr[i] + " "); 
    }
    System.out.println();
}

    public static void QuickSort(int arr[] , int si , int ei){
        // base case 
        if(si >= ei){
            return;
        }
        
        // recursive call
        int PIdx = Partitiong(arr, si, ei);
        QuickSort(arr, si, PIdx-1);
        QuickSort(arr, PIdx+1, ei); // right part
    }


    public static int Partitiong(int arr[] , int si, int ei){
        // to choose a pivot element

        int pivot = arr[ei];
        int i = si-1; // to make place for element smaller than pivot

        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                 i++; // agar j ki value choti h pivot se 

                // swap
                 int temp = arr[j];
                 arr[j] = arr[i];
                 arr[i] = temp;
            }
    }

        // to set pivot element in the correct position

        i++;
         int temp = pivot;
         arr[ei] = arr[i];
         arr[i] = temp;
         return i;


    }


    public static void main(String[] args) {
        int arr[] = {9,4,7,2,8,5};
        QuickSort(arr, 0, arr.length-1);
        printarr(arr);
        

    }

}
