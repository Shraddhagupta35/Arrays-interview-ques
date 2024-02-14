package BIT_MANIPULATION;

public class Set_ith_bit {
        
    // set ith bit isme convert krna 1 ko



    public static int setIthBit(int n, int i){
        int bit_mask = 1<<i;
        return(n | bit_mask);
    }
    public static void main(String[] args) {
        System.out.println(setIthBit(10, 2));
    }  
    
}
