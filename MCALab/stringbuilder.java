public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hi, ");
        sb.append("Hello");
        System.out.println("StringBuilder content: " + sb.toString());
        sb.insert(4, "Java ");
        System.out.println("Modified content: " + sb.toString());
        sb.replace(0, 2, "Hello");
        System.out.println("Replaced content: " + sb.toString());
        sb.delete(0, 7);
        System.out.println("Final content: " + sb.toString());
    }
}
