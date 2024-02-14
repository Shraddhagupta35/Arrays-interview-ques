public class Foreach_loop {
    public static void main(String[] args) {
         String s1 = "INDIA";
        char s2[] = new char[6];

        for(int i=0; i<s1.length(); i++){
            s2[i] = s1.charAt(i);
        }

        for(char e : s2){
            System.err.println( "the value are : " + e);
        }
      // program 2
      /* 
        int ar[] = {10,20,30,40,50,60,70, 80,90,100};
        for(int x : ar){
            System.out.print(x + " ");
        }
        System.out.println();
        for(int x : ar){
            System.out.print(x + " ");
        }*/
    }
    
}
