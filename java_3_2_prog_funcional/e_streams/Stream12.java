package e_streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class Stream12 {
    public static void main(String[] args) {
        String[] a = new String[] {"Yasmin", "Octavio", "Sergio", "Mario", "Aarón"};

        Stream<String> stream = Arrays.stream(a);

        String[] a2 = stream.map(s -> s.toUpperCase()).toArray(String[]::new);

        System.out.println(Arrays.deepToString(a2));

        int[][] x = {{1,2},{2,3}};
        System.out.println(Arrays.deepToString(x));
    }
}