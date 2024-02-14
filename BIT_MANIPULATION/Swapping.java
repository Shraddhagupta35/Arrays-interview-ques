package BIT_MANIPULATION;

            // using XOR
            
public class Swapping {
    public static void main(String[] args) {
        int x = 3, y=4;
        System.out.println("before swapping " + x + "and " + y);

        x = x^y;
        y = x^y;
        x = x^y;

        System.out.println("after swapping " + x + "and" + y);
     }
    
}
