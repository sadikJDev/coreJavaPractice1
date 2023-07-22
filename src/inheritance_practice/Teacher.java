
package inheritance_practice;

public class Teacher extends Person {
    private String qualification;
    
    public void setQualification(String qualification){
        this.qualification = qualification;
    }
    
    public String getQualification(){
        return qualification;
    }
    
      void displayInfo(){
        System.out.println("Name : " + getName());
        System.out.println("Age : " + getAge());
        System.out.println("Qualification : " + getQualification());
        System.out.println("Posting :" + getPosting());
    }
    
    
    
}
