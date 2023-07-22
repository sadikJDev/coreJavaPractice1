
package methodOverRiding;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Md. Shadikur Rahman";
        t1.age = 28;
        t1.qualification = "Java Developer";
        t1.displayInformation();
        System.out.println("\n");
        
        
        Person p1 = new Person();
        p1.name = " Shaheen Alam";
        p1.age = 26;
        p1.displayInformation();
    }
}
