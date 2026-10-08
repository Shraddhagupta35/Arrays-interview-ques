package LOOP;
import java.util.Scanner;

public class Sum_OR_Product {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Test cases: ");
        int t = sc.nextInt();

        long mod = 1000000009L;

        while(t-- > 0){
            System.out.println("Enter the value of n: ");
            int n = sc.nextInt();
            System.out.println("Enter the value of q: ");
            int q = sc.nextInt();

            long result;

            if(q == 1){
                result = (long) n * (n + 1) / 2;
            
            }else {
                result = 1;
                for(int i=1; i<=n; i++){
                    result = (result * i) % mod;
                }
            }

            System.out.println("Result: " + result);
        }

        sc.close();
    }
    
}
