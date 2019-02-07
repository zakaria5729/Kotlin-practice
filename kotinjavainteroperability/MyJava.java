package kotinjavainteroperability;

public class MyJava {
    public static void main(String[] args) {
        System.out.println("Printing extension_function.sum from java file: " + MyKotlinKt.sumFromKotlin(2, 4));

        System.out.println("Printing extension_function.sum from java file: " + MyCustomKotlinFileName.sumFromKotlin2(2, 4));
    }

    public static int sumFromJava(int x, int y) {
        return x+y;
    }
}
