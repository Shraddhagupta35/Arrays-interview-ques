package ARRAYS;

public class Largest_number {
    // PROGRAM NO 3
    // LARGEST NUMBER
     
    public static int getlargest(int numbers[] ){
      int largest = Integer.MIN_VALUE;  // -infinity likhne ka tarika
      int smallest = Integer.MAX_VALUE;   // +infinity likhne ka tarika
      for(int i=0; i<numbers.length; i++){
        if(largest < numbers[i]){
          largest = numbers[i];
        } 
        if(smallest > numbers[i]){
          smallest = numbers[i];
          System.out.println("smallest number is : " +smallest);
        }  
      }
      return largest;
    }

    public static void main(String[] args) {
       //Scanner sc = new Scanner(System.in);
      int value[] = {2,4,87,34,56,20,6,9,298,3,5,23};
        System.out.println("largest value is : " +getlargest(value));
       // sc.close();
      }
    
    
}
