package DIVIDE_CONQUER.Majority.Inverse;

// time compexity -- O(n*2)

public class Brute_force {
    public static int getInvCount(int arr[]){
        int n = arr.length;
        int invCount = 0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] > arr[j]){
                    invCount++;
                }
            }
        }
        return invCount;
    } 
    public static void main(String[] args) {
        int arr[] = {1,30,6,4,5};
        System.out.println("Inversion count = " + getInvCount(arr));
    }

    
}
