public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder("hello world");
        string.insert(5,"qweqwe");
        System.out.println(string);
    }
}
