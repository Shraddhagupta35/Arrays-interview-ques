 // call by reference
// PROGRAM NO : 1

package ARRAYS;

public class Call_reference {
    
    public static void update(int marks[]){
      for(int i=0; i<marks.length; i++){
        marks[i] = marks[i] + 1;
      }    
    }

    public static void main(String[] args) {
        int marks[] = {45, 56, 53,98};
        System.out.println("before marks[] = ");
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        update(marks);
         System.out.println("after marks[] = ");
        for(int i=0; i<marks.length; i++){
            System.out.print( marks[i] + " ");
        }
        System.out.println();
    }

    
}
