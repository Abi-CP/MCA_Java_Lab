public class Some {
    public static void main(String[] args) throws Exception {
        SomeClass testException;

        try {
            testException = new SomeClass();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class SomeClass {
    SomeClass() throws Exception {
        throw new Exception("Exception Occurred");
    }
}
