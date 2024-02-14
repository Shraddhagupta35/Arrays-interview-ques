package BIT_MANIPULATION;

public class Clear_ith_bit {
   // clear ith bit means given i position then convert 0
     
        public static int clearIthbit(int i , int n){
            int bit_mask = ~(1<<i);
            return (n  & bit_mask);
        }
        public static void main(String[] args) {
            System.out.println("the final output --> " + clearIthbit(1, 10));
        }  
    
}
