
package super_keyword;

public class Vehicle {
    String name;
    int weight;
    
    Vehicle(String n, int w){
        name = n;
        weight = w;
    }
    
    void attribute(){
        System.out.println("Name : " + name);
        System.out.println("Weight : " + weight);
    }
}
