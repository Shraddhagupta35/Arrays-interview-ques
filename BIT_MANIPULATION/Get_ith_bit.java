package BIT_MANIPULATION;

public class Get_ith_bit {
    public static int getIthBit(int n, int i){
        int bit_mask = 1<<i;
        if((n & bit_mask) == 0){
            return 0;
        }else{
            return 1;

        }
    }

    public static void main(String[] args) {
        
        System.out.println("the value of i bit  : " + getIthBit(15, 2));
    }
   
    
}
