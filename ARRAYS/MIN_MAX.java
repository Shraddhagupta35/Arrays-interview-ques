// to find minimum and maximum value
package ARRAYS;

public class MIN_MAX {
    public static int findSum(int a[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=0; i<a.length; i++){
            max = max > a[i] ? max : a[i];
            min = min < a[i] ? min : a[i];
        }
        System.out.println(max);
        System.out.println(min);
        sum = max + min ;
        return sum ;
    }
    public static void main(String[] args) {
        int a[] = {-2,1,-4,5,3};
        System.out.println(findSum(a));

    }   
}
