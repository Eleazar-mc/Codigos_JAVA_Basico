package e_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream07 {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        List<String> filtrado = lista.stream().filter(cad -> !cad.isEmpty()).collect(Collectors.toList());
        System.out.println("Lista filtrada: " + filtrado);

        String mezcla = lista.stream().filter(cad -> !cad.isEmpty()).collect(Collectors.joining("***"));
        System.out.println("Cadena mezclada: " + mezcla);
    }
}