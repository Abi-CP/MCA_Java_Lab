public class Lab7 {
    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception ex) {
            // printing stack trace
            ex.printStackTrace();
        }
    }

    public static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public static void someMethod2() throws Exception {
        throw new Exception("Exception thrown from someMethod2");
    }
}
