public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hi");
        stringBuffer.append(", Hello");
        stringBuffer.insert(6, "Java ");
        stringBuffer.replace(0, 4, "Hi");
        stringBuffer.delete(1, 4);
        int length = stringBuffer.length();
        stringBuffer.reverse();
        String result = stringBuffer.toString();
        System.out.println(result);
    }
}
