public class StringOperations {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String concatenated = str1 + " " + str2;
        System.out.println("Concatenated String: " + concatenated);
        int length = concatenated.length();
        System.out.println("Length of the String: " + length);
        char charAtIndex = concatenated.charAt(6);
        System.out.println("Character at index 6: " + charAtIndex);
        String substring = concatenated.substring(0, 5);
        System.out.println("Substring from index 0 to 5: " + substring);
        String uppercase = concatenated.toUpperCase();
        String lowercase = concatenated.toLowerCase();
        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);
        boolean containsWorld = concatenated.contains("World");
        System.out.println("Contains 'World': " + containsWorld);
        String replaced = concatenated.replace("World", "Universe");
        System.out.println("Replaced 'World' with 'Universe': " + replaced);
        String[] parts = concatenated.split(" ");
        System.out.println("Split into an array: ");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
