package e_streams;

import java.util.Arrays;
import java.util.List;

public class Stream05 {
    public static void main(String[] args) {
        List<String>cadenas = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl", "");

        //Cuenta las cadenas vacías
        System.out.println(cadenas.stream());
        System.out.println(cadenas.stream().filter(cad -> cad.isEmpty()));
        System.out.println(cadenas.stream().filter(cad -> cad.isEmpty()).count());
    }
}