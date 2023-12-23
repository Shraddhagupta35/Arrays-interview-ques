// PROGRAM NO 2
// LINEAR SEARCH PROGRAM

package ARRAYS;

public class Linear_search {
    
       public static int LINEAR_SEARCH(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
          if(numbers[i] == key){
            return i;
          }
        }
        return -1;
       }
    public static void main(String[] args) {
       int values[] = {2, 38, 45,3,8,93 ,4, 29, 20};
       int key = 45;
       int index = LINEAR_SEARCH(values, key);
        if( index == -1){
          System.out.println("values is not exist in the index");
        }else{
          System.out.println("value at the index is = " +index);
        }
       

      System.out.println();
    } 

    
}
