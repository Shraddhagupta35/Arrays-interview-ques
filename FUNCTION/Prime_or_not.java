package FUNCTION;

public class Prime_or_not {
    public static boolean isPrime(int n){
        boolean isPrime = true ;
        for(int i=2; i<=Math.sqrt(n); i++){
            if( n % i == 0){
                System.out.println("notPrime");
            } 
        }                        
        return isPrime;
      }

    public static void main(String[] args) {
        
        isPrime(5);
    }
    
}
