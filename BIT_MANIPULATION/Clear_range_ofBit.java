package BIT_MANIPULATION;

public class Clear_range_ofBit {
    public static int rangeofBits(int n , int i , int j){
        int a = (~0)<<j+1;
        int b = (1<<i)-1;
        int bit_mask = a | b ;
        return n & bit_mask;

     }
     public static void main(String[] args) {
        System.out.println(rangeofBits(10, 02, 4));
     }
    
}
