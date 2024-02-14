/* to print  ********
             *      *
             *      *
             ********
             *      *
             *      *
             *      *
 */

package PATTERN;

public class A_pattern {

    public static void A_hollow(int trow , int tcol ){
        for(int i=1; i<=trow; i++){
            for(int j=1; j<=tcol; j++){
                if(i==1 || j==1 || i==(trow+1)/2 || j==tcol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        A_hollow(7, 8);
    }
    
}
