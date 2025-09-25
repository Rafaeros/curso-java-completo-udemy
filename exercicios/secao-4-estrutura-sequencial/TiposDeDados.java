public class TiposDeDados {
    public static void main(String[] args) {
        byte b = 127; // 8 bits -128 to 127
        short s = 32767; // 16 bits -32768 to 32767
        long l = 9223372036854775807L; // 64 bits -9223372036854775808 to 9223372036854775807
        int i = 30; // 32 bits -2147483648 to 2147483647
        float f = 1.75f; // 32 bits
        double d = 2500.50; // 64 bits
        char c = 'A'; // 16 bits
        String str = "Hello, World!"; // String is not a primitive type, but a class in Java
        boolean bool = true; // 1 bit, true or false

        // Integer Types
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Long: " + l);
        System.out.println("Int: " + i);

        // Floating Point Types
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);

        // Character Type
        System.out.println("Char: " + c);

        // String Type
        System.out.println("String: " + str);

        // Boolean Type
        System.out.println("Boolean: " + bool);
    }
}
