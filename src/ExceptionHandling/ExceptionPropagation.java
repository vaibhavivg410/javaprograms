package ExceptionHandling;
//8. Exception Propagation
//Write a program that demonstrates exception propagation by calling a method that 
//throws an unchecked exception and handling it in the calling method.
//Input:
//•	No specific input required.
//Output:
//•	The caught exception message.

public class ExceptionPropagation {
	public static void main(String[] args) {
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }
        
        try {
        	method3();
        } catch(RuntimeException e) {
        	System.out.println(e);
        }
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        int result = 10 / 0; // This will throw ArithmeticException
    
	}
    
    public static void method3() {
        throw new RuntimeException("Something went wrong in method3!");
    }
}
