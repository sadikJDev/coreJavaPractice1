
package examPractice;
//Create a class Student with properties id, name. 
//Create an interface Human with abstract method exampleMethod().
//Implement Human in class Student. 
//Create an abstract class Pakna with a method searchThePakna().
//Inherit Pakna in class Student.   
public class Student extends Pakna implements Human {
      private int id;
      private String name;
      
      
      public int getId(){
        return id;
      }
      
      public void setId(int id ){
         this.id = id; 
      }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
   public Student(int id, String name){
       this.id = id;
       this.name = name;
   }
   
 
      
      @Override
    public void exampleMethods(){
        System.out.println("This is Example Methods ");
    }
    
      @Override
    public void searchThePakna(){
        System.out.println("Search the pakna ");
    }
      
      
    
}
