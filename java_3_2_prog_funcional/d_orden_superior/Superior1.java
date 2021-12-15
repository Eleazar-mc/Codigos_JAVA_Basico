package d_orden_superior;

import java.util.*;

public class Superior1 {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);

        a.forEach(System.out::println); // funciones de orden superior

        System.out.println(a);
    }
}