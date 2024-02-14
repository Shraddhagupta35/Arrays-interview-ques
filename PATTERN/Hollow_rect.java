/* To print ********
            *      *
            *      *
            *      *
            ********
 */

package PATTERN;

public class Hollow_rect {
    public static void main(String[] args) {
        int n=5;
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                if(i==0 || j==0 || i==n || j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // public static void hollow(int trow, int tcol){
    //     for(int i=1; i<=trow; i++){
    //         for(int j=1; j<=tcol; j++){
    //             if(i==1 || i==trow || j==1 || j==tcol){
    //                 System.out.print("*");
    //             }else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args) {
    //     hollow(4, 5);
    // }
    
}
