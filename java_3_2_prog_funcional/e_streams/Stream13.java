package e_streams;

import java.util.Arrays;

public class Stream13 {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 8 };
        int suma = Arrays.stream(arr).sum();
        System.out.println(suma);

        String[] arr2 = { "this", "is", "a", "sentence" };
        String cad = Arrays.stream(arr2).reduce("*", (a,b) -> a + b);
        System.out.println(cad);

        String[] arr3 = Arrays.stream(arr2).filter(s -> s.length() > 4).toArray(String[]::new);
        System.out.println(Arrays.toString(arr3));
    }
}