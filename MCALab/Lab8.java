public class Lab8 {
    public static void methodWithTryBlock() {
        try {
            int result = 10 / 0;
        } catch (NumberFormatException e) {
            System.out.println("Caught a NumberFormatException");
        }
        System.out.println("Method continues after the try block");
    }

    public static void main(String[] args) {
        try {
            methodWithTryBlock();
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException outside the method");
        }
        System.out.println("Program continues after the method call");
    }
}
