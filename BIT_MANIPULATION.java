
public class BIT_MANIPULATION {
    // program no 1
    // bitwise operator
/* 
    public static void main(String[] args) {

        System.out.println("binary AND operator --> " + (5 & 7) );
        System.out.println("binary OR operator --> " + (5 | 7) );
        System.out.println("binary XOR operator --> " + (5 ^ 7) );
        System.out.println("binary ONE'S COMP'S operator --> " + (~5));
        System.out.println("binary LEFT SHIFT operator --> " + (5 << 2) );
        System.out.println("binary RIGHT SHIFT operator --> " + (6 >> 1) );

    }  */

    // program no 2
    // check even odd case
     /*   
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
    } */


    // program no 3
    // get ith bit

/* 
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
    */

    // program no 4    // set ith bit isme convert krna 1 ko
/* 
    public static int setIthBit(int n, int i){
        int bit_mask = 1<<i;
        return(n | bit_mask);
    }
    public static void main(String[] args) {
        System.out.println(setIthBit(10, 2));
    }  */

    // program no 5       clear ith bit means given i position then convert 0
/* 
    public static int clearIthbit(int i , int n){
        int bit_mask = ~(1<<i);
        return (n  & bit_mask);
    }
    public static void main(String[] args) {
        System.out.println("the final output --> " + clearIthbit(1, 10));
    }  */

    // program no 6       clear last i bit
   /* 
    public static int clearLastIthBit(int n , int i){
        int bit_mask = (~0)<<i;
        return n & bit_mask;
    }
    public static void main(String[] args) {
        System.out.println("the final output --> " + clearLastIthBit(15, 2));
    } */


    // program no 7 
     // clear last ith bit 
     
     
     public static int clearIthBitRange(int i, int n){
        int bit_mask = (~0)<<i;
        return n & bit_mask;
     }
     public static void main(String[] args) {
       System.out.println(clearIthBitRange(2, 15)); 
     } 

     // program no 8
     //  clear range of bits
    /* 
     public static int rangeofBits(int n , int i , int j){
        int a = (~0)<<j+1;
        int b = (1<<i)-1;
        int bit_mask = a | b ;
        return n & bit_mask;

     }
     public static void main(String[] args) {
        System.out.println(rangeofBits(10, 02, 4));
     }  */

     // swaping 
     // using XOR

    /*  public static void main(String[] args) {
        int x = 3, y=4;
        System.out.println("before swapping " + x + "and " + y);

        x = x^y;
        y = x^y;
        x = x^y;

        System.out.println("after swapping " + x + "and" + y);
     }*
  
}
