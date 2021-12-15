package e_streams;

import java.util.stream.Stream;

public class Stream09 {
    public static void main(String[] args) {
        System.out.println(Stream.of(1,2,3,4,5));
        System.out.println(Stream.of(1,2,3,4,5).count());
        System.out.println(Stream.of("zoo", "a", "b", "hola", "c").findFirst().get());
    }
}