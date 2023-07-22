
package examPractice;

public class Exception {
    public static void main(String[] args) {
        
        
        try{
            int x = 10;
            int y = 0;
            int result = x / y;
            System.out.println("Result :" + result);
        }catch (ArrayIndexOutOfBoundsException rr){
            System.out.println("ArithmeticException : " + rr);
        }catch(ArrayStoreException e2){
            System.out.println(e2);
        }catch(ArithmeticException e){
                System.out.println(e);
            }
        finally{
            System.out.println("This is finally block");
        }
        
        System.out.println("This is last line");
        
    }
}
