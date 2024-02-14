package BIT_MANIPULATION;

public class Clear_last_ith_bit {
    public static int clearIthBitRange(int i, int n){
        int bit_mask = (~0)<<i;
        return n & bit_mask;
     }
     public static void main(String[] args) {
       System.out.println(clearIthBitRange(2, 15)); 
     } 

    
}
