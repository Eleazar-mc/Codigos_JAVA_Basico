package e_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Stream10 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(25);
        lista.add(5);
        lista.add(-23);

        Stream<Integer> s = lista.stream();
        System.out.println(s.filter(Predicate.isEqual(5)).count());

        List<String> lista2 = new ArrayList<>();
        lista2.add("H");
        lista2.add(new String("J"));
        Stream<String> s2 = lista2.stream();
        System.out.println(s2.filter(Predicate.isEqual(new String("H"))).count());
    }
}