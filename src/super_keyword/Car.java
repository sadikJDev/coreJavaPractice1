
package super_keyword;

public class Car extends Vehicle {
     String gear;
     
     Car (String n, int w, String g){
         super(n, w);
         gear = g;
     }
     
     void attribute(){
         super.attribute();
         System.out.println("Gear : " + gear );
     }
}
