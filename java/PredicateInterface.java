import java.util.Objects;
import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {
        Predicate<String> notNull = Objects::nonNull;
        Predicate<String> notEmpty = str -> !str.isEmpty();

        String str = "Hello";

        if (notNull.and(notEmpty).test(str)) {
            System.out.println("String is not null and not empty");
        }
    }
}
