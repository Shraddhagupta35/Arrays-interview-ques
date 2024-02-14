package DIVIDE_CONQUER.Majority.Inverse;
/* 
public class modify_mergeSort {
    public static int merge(int arr[] , int left , int mid , int right ){
        int i = left ;
        int j = mid;
        int k = 0;
        int temp[] = new int[(right - left + 1)];

        while((i < mid) && (j <= right)){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                k++;
                i++;

            }else{
                temp[k] = arr[j];
                invCount += (mid-1);
                k++;
                i++;
            }
        }

        while(i < mid){
            temp[k] = arr[i];
            k++;
            i++;
        }

        while(j <= right){
            temp[k] = arr[j];
            k++;
            j++;
        }

        for(i = left , k=0; i<= right ; i++ , k++){
            arr[i] = temp[k];
        }
        return invCount;
    }

    private static int mergeSort(int arr[] , int left , int right){
        int invCount = 0;

        if(right > left){
            int mid = (right + left)/2;

            invCount = mergeSort(arr, left, mid);
            invCount += mergeSort(arr, mid+1, right);
            invCount += mergeSort(arr, left , mid-1);
        }
    }
    
}
*/