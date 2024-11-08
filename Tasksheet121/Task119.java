import static java.lang.Math.*;

public class Task119 {
    public static int add(int a, int b) {
        return addExact(a, b); 
    }
    public static int subtract(int a, int b) {
        return subtractExact(a, b); 
    }
    public static int multiply(int a, int b) {
        return multiplyExact(a, b); 
    }
    public static float divide(int a, int b) {
        return floorDiv(a, b); 
    }

    public static void main(String[] args) {
        int a = 10, b = 5;

        try {
            System.out.println("Addition of " + a + " and " + b + " = " + add(a, b));
            System.out.println("Subtraction of " + a + " and " + b + " = " + subtract(a, b));
            System.out.println("Multiplication of " + a + " and " + b + " = " + multiply(a, b));
            System.out.println("Division of " + a + " by " + b + " = " + divide(a, b));

            int c = -20, d = 4;
            System.out.println("Addition of " + c + " and " + d + " = " + add(c, d));
            System.out.println("Subtraction of " + c + " and " + d + " = " + subtract(c, d));
            System.out.println("Division of " + c + " by " + d + " = " + divide(c, d));
        } 
            catch (ArithmeticException e) {
            System.out.println("Error in arithmetic operation: " + e.getMessage());
        }
    }
}