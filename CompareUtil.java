public class CompareUtil {
    public static <T extends Comparable<T>> boolean isEqual(T a, T b) {
        return a.compareTo(b) == 0;
    }

    public static void main(String[] args) {
        System.out.println("Integer sama? " + isEqual(5, 5));
        System.out.println("String sama? " + isEqual("Hello", "World"));
        System.out.println("Double sama? " + isEqual(3.14, 3.14)); // Test case Double
        System.out.println("Character sama? " + isEqual('A', 'A')); // Test case Character
    }
}