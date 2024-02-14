package BIT_MANIPULATION;

public class Even_Odd {
    public static void CheckEvenOdd(int n){
        int bit_mask = 1;
        if((bit_mask & n) == 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        
        CheckEvenOdd(3);
        CheckEvenOdd(43);
        CheckEvenOdd(6);
    }
    
}
