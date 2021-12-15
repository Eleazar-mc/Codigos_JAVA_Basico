package d_orden_superior;

import java.util.List;
import java.util.function.Predicate;

public class Superior2 {
    public static void main(String[] args) {
        Predicate<Integer> mayor19 = n -> n > 19; // Predicado
        List.of(3,80,12,45,19,67,11,37,9,1,78).stream().filter(mayor19).forEach(System.out::println);

        System.out.println("-------");
        List.of(3,80,12,45,19,67,11,37,9,1,78).stream().filter(
        new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n > 19;
            }
        }
        ).forEach(System.out::println);

        System.out.println("-------");
        Predicate<Integer> f = (n) -> n > 19;
        List.of(3,80,12,45,19,67,11,37,9,1,78).stream().filter(f).forEach(System.out::println);

        System.out.println("-------");
        Predicate<Integer> g = n -> n > 19;
        List.of(3,80,12,45,19,67,11,37,9,1,78).stream().filter(g.negate()).forEach(System.out::println);
    }
}
