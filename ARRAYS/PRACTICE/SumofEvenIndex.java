package ARRAYS.PRACTICE;

public class SumofEvenIndex{
    public static void main(String[] args) {
        

        int arr[] = {3,20,4,6,9};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            i++;
        }

        System.out.println(sum);
    }
}