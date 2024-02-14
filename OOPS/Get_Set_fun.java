package OOPS;

public class Get_Set_fun {
    public static void main(String[] args) {

        Students s1 = new Students();
        s1.name = " abhinay";
        s1.setroll(45);
        s1.percentage = 89.7;
        System.out.println(s1.name);
        System.out.println(s1.percentage);
        System.out.println(s1.getroll());
    
        s1.setname("ram");
        System.out.println(s1.name);
      }
    }
        class Students{
         
        String name;
        private int rollno;
        double percentage;
    
        public int getroll(){
         return this.rollno;
        }

        void setname(String new_name){
          this.name = new_name;
        }
    
        void setroll(int roll){
          this.rollno = roll;
    
        }
    
}
