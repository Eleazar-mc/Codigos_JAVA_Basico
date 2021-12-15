package e_streams;

import java.util.stream.Stream;

public class Stream14 {
    public static void main(String[] args) {
        Stream<Integer> numeros = Stream.iterate(0, n -> n + 10).limit(25);
        numeros.forEach(System.out::println);

        Stream.iterate(100, n -> n + 1).forEach(System.out::println);
    }
}