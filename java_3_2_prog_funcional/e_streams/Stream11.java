package e_streams;

import static java.lang.System.out;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Stream11 {
    public static void main(String[] args) {
        IntStream.range(1,11).forEach(out::println);

        LongStream.range(1,11).forEach(out::println);

        System.out.println(DoubleStream.of(1.23, 2.34, 3.45).min().getAsDouble());

        DoubleStream.of(1.23, 2.34, 3.45).forEach(out::println);
    }
}