import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> printUpperCase = text -> System.out.println(text.toUpperCase());
        Consumer<String> printLowerCase = text -> System.out.println(text.toLowerCase());

        printUpperCase.accept("Hello"); // Вывод: HELLO
        printLowerCase.accept("WORLD"); // Вывод: world
    }
}
