@FunctionalInterface
interface Printable {
    void print(String text);
}

public class Interface {
    public static void main(String[] args) {
        Printable printUpperCase = text -> System.out.println(text.toUpperCase());
        Printable printLowerCase = text -> System.out.println(text.toLowerCase());

        printUpperCase.print("Hello"); // Вывод: HELLO
        printLowerCase.print("WORLD"); // Вывод: world
    }
}