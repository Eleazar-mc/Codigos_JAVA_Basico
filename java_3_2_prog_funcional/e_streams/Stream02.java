package e_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream02 {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        System.out.println(lista);
        System.out.println(lista.stream());
        System.out.println(lista.stream().collect(Collectors.toList()));
        System.out.println(lista.stream().filter(cad -> !cad.isEmpty()));  // f = (x, y) -> x + y
        System.out.println(lista.stream().filter(cad -> !cad.isEmpty()).collect(Collectors.toList()));
    }
}