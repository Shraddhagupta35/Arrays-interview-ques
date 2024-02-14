package BIT_MANIPULATION;

public class Clear_last_ith_bit {
    public static int clearLastIthBit(int n , int i){
        int bit_mask = (~0)<<i;
        return n & bit_mask;
    }
    public static void main(String[] args) {
        System.out.println("the final output --> " + clearLastIthBit(15, 2));
    }
    
}
